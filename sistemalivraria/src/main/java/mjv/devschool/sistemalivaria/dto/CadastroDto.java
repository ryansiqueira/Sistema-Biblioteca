package mjv.devschool.sistemalivaria.dto;

import java.io.Serializable;

import mjv.devschool.sistemalivaria.model.Cadastro;

public class CadastroDto implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String login;
	private String senha;
	private String cep;
	
	
	public CadastroDto() {
		
	}
	
	public CadastroDto(Long id, String nome,String email,String cpf,String telefone,String login,String senha, String cep) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
		this.cep=cep;
		
	}
	
	public CadastroDto(Cadastro entidade) {
		
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.email = entidade.getEmail();
		this.cpf = entidade.getCpf();
		this.telefone = entidade.getTelefone();
		this.login = entidade.getLogin();
		this.senha = entidade.getSenha();
		this.cep = entidade.getCep();
		
	}
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	

	
}
