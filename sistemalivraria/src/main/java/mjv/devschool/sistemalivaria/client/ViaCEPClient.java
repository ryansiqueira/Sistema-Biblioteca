package mjv.devschool.sistemalivaria.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mjv.devschool.sistemalivaria.model.Endereco;

@FeignClient(url="https://viacep.com.br/ws/", name= "viacep")
public interface ViaCEPClient {
	
		@GetMapping("{cep}/json")
    	Endereco buscaEnderecoPor(@PathVariable("cep") String cep);
	
	
}
