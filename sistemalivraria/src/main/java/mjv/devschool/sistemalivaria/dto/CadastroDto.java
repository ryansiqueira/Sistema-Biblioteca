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
	
	
	EnderecoDto enderecoDto = new EnderecoDto();
	
	
	public CadastroDto() {
		
	}
	
	public CadastroDto(Long id, String nome,String email,String cpf,String telefone,String login,String senha) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
		
	}
	
	
	


	public EnderecoDto getEnderecoDto() {
		return enderecoDto;
	}

	public void setEnderecoDto(EnderecoDto enderecoDto) {
	     	
		this.enderecoDto = enderecoDto;
		
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
	

	
}
