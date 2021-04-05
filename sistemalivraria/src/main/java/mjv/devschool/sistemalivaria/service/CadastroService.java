package mjv.devschool.sistemalivaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import mjv.devschool.sistemalivaria.dto.CadastroDto;
import mjv.devschool.sistemalivaria.exception.BusinessException;
import mjv.devschool.sistemalivaria.exception.CampoObrigatorioException;
import mjv.devschool.sistemalivaria.model.Cadastro;
import mjv.devschool.sistemalivaria.model.Endereco;
import mjv.devschool.sistemalivaria.model.Livro;
import mjv.devschool.sistemalivaria.repositorie.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository cadRepository;

	//@Autowired
	//private ViaCEPClient viaCepClient;
	
	
	public Iterable<Cadastro> findAll(){
		
		List<Cadastro> list = cadRepository.findAll();
		
		return list;
	}

	@Transactional
	public Cadastro insert(CadastroDto dto) {
		
		Cadastro entidade = new Cadastro();
		cpDtoParaEntidade(dto,entidade); 
		verificaLogin(entidade);
		//verificaEndereco(entidade);
		entidade = cadRepository.save(entidade);
		return entidade;
		
	}
	
	
	
	private void cpDtoParaEntidade(CadastroDto dto, Cadastro entidade ) {
		
		entidade.setNome(dto.getNome());
		entidade.setTelefone(dto.getTelefone());
		entidade.setEmail(dto.getEmail());
		entidade.setCpf(dto.getCpf());
		entidade.setLogin(dto.getLogin());
		entidade.setSenha(dto.getSenha());
		
		RestTemplate template = new RestTemplate();
		entidade.setEndereco(template.getForObject("https://viacep.com.br/ws/{cep}/json",Endereco.class,dto.getEnderecoDto().getCep()));
		
	
	}
	
	// Metodo para verificar o tamanho do campo login e se ele é nulo ou vazio;
		private void verificaLogin(Cadastro login) {
			var validaLogin = login.getLogin();
			
			if(validaLogin.length() > 20) {
				throw new BusinessException("Campo login não pode ultrapassar 20 caracteres");
				
			}
			if(validaLogin == null || validaLogin.isEmpty())
			{
				throw new CampoObrigatorioException("Campo login não pode ser nulo, nem vazio");
			}
		}		
		
			// Metodo para verificar se o campo endereco é nulo ou vazio
			private void verificaEndereco(Cadastro endereco) {
				var validaEndereco = endereco.getEndereco().getCep();
				
				if(validaEndereco == null || validaEndereco.toString().isEmpty())
				{
					throw new BusinessException("Campo endereço não pode ser nulo, nem vazio");
				}
				
		}	
					
		
	
	
	
	
}
