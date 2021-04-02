package mjv.devschool.sistemalivaria.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_locacaoitem")
public class LocacaoItem implements Serializable {

	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	
	private LocalDate dataPrevisaoEntrega;
	private LocalDate dataEntrega;
	private Integer diarias;
	private Double valorDiaria;
	private Double valorLocacao;
	
	
	
	@ManyToOne
	@JoinColumn(name = "livros_id")
	List<Livro> livros = new ArrayList<>();
	
	public LocacaoItem() {
		
	}

	public LocacaoItem(Long id, LocalDate dataPrevisaoEntrega, LocalDate dataEntrega, Integer diarias, Double valorDiaria, Double valorLocacao) {
		
		this.id = id;
		this.dataPrevisaoEntrega = dataPrevisaoEntrega;
		this.dataEntrega = dataEntrega;
		this.diarias = diarias;
		this.valorDiaria = valorDiaria;
		this.valorLocacao = valorLocacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataPrevisaoEntrega() {
		return dataPrevisaoEntrega;
	}

	public void setDataPrevisaoEntrega(LocalDate dataPrevisaoEntrega) {
		this.dataPrevisaoEntrega = dataPrevisaoEntrega;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Integer getDiarias() {
		return diarias;
	}

	public void setDiarias(Integer diarias) {
		this.diarias = diarias;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	
	
	
}
