package mjv.devschool.sistemalivaria.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import mjv.devschool.sistemalivaria.model.Livro;

public class LivroDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String isbn;

	private Double valorDiaria;

	private Integer exemplares;

	private Integer reservados;


	public LivroDto() {
	}

		
	public LivroDto(Long id, String isbn, Double valorDiaria, Integer exemplares, Integer reservados){


		this.id = id;
		this.isbn = isbn;
		this.valorDiaria = valorDiaria;
		this.exemplares = exemplares;
		this.reservados = reservados;
	}
	
	public LivroDto(Livro entidade) {
		
		this.id = entidade.getId();
		this.isbn = entidade.getIsbn();
		this.valorDiaria = entidade.getValorDiaria();
		this.exemplares = entidade.getExemplares();
		this.reservados = entidade.getReservados();
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Integer getExemplares() {
		return exemplares;
	}

	public void setExemplares(Integer exemplares) {
		this.exemplares = exemplares;
	}

	public Integer getReservados() {
		return reservados;
	}

	public void setReservados(Integer reservados) {
		this.reservados = reservados;
	}
	

}
