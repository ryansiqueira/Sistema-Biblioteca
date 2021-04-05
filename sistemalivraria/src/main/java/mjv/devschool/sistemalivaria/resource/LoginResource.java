package mjv.devschool.sistemalivaria.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.devschool.sistemalivaria.dto.CadastroDto;
import mjv.devschool.sistemalivaria.dto.Sessao;
import mjv.devschool.sistemalivaria.model.Cadastro;
import mjv.devschool.sistemalivaria.service.loginService;

@RestController
@RequestMapping(value = "/login")
public class LoginResource {

	@Autowired
	private loginService service;
	@PostMapping
	public Sessao logar(@RequestBody Cadastro login){
		return service.logar(login);
	}
}
