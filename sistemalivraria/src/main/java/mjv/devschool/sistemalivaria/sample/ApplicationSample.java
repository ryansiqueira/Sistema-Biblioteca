package mjv.devschool.sistemalivaria.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mjv.devschool.sistemalivaria.dto.CadastroDto;
import mjv.devschool.sistemalivaria.model.Cadastro;
import mjv.devschool.sistemalivaria.repositorie.CadastroRepository;
import mjv.devschool.sistemalivaria.service.CadastroService;


@Component
public class ApplicationSample {
	
	@Autowired
	private CadastroRepository cadRepository;
	
	@Autowired
	private CadastroService service;
	
	public void usuarioPadrao() {
		CadastroDto c = new CadastroDto();
		c.setLogin("mop");
		c.setSenha("mop123");
		service.insert(c);
		
	}

}
