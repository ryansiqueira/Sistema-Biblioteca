package mjv.devschool.sistemalivaria.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mjv.devschool.sistemalivaria.config.security.JWTConstants;
import mjv.devschool.sistemalivaria.config.security.JWTUtils;
import mjv.devschool.sistemalivaria.dto.CadastroDto;
import mjv.devschool.sistemalivaria.dto.Sessao;
import mjv.devschool.sistemalivaria.model.Cadastro;
import mjv.devschool.sistemalivaria.repositorie.CadastroRepository;

@Service

public class loginService {
	@Autowired
	private CadastroRepository repository;

	@Autowired
	private PasswordEncoder encoder;

	public Sessao logar(Cadastro login) {

		Cadastro usuario = repository.findByLogin(login.getLogin());
		if (usuario != null) {
			boolean senhaOK = encoder.matches(login.getSenha(), login.getLogin());
			if (senhaOK) {

				Sessao sessao = new Sessao();
				sessao.setLogin(login.getLogin());

				Date inicio = new Date(System.currentTimeMillis());
				Date fim = new Date(System.currentTimeMillis() + JWTConstants.TOKEN_EXPIRATION);

				sessao.setDataInicio(inicio);
				sessao.setDataFim(fim);

				String token = JWTUtils.creteToke(login.getLogin(), inicio, fim);

				sessao.setToken(token);

				return sessao;

			} else {

				throw new RuntimeException("Senha Invalido");
			}

		}
		throw new RuntimeException("Login Invalido");
	}

}
