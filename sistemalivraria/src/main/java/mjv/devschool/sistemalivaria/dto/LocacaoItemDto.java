package mjv.devschool.sistemalivaria.dto;

import java.io.Serializable;
import java.util.Date;

import mjv.devschool.sistemalivaria.model.LocacaoItem;

public class LocacaoItemDto implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Date dataPrevisaoEntrega;
	private Date dataEntrega;
	private Integer diarias;
	private Double valorDiaria;
	private Double valorLocacao;
	
	LocacaoDto locacaoDto;
	

	public LocacaoItemDto() {
		
	}
	
	public LocacaoItemDto(Long id, Date dataPrevisaoEntrega,Date dataEntrega,Integer diarias,Double valorDiaria,Double valorLocacao) {
		
		this.id = id;
		this.dataPrevisaoEntrega = dataPrevisaoEntrega;
		this.dataEntrega = dataEntrega;
		this.diarias = diarias;
		this.valorDiaria = valorDiaria;
		this.valorLocacao = valorLocacao;
		
	}
	
	public LocacaoItemDto(LocacaoItem entidade) {
		
		this.id = entidade.getId();
		this.dataPrevisaoEntrega = entidade.getDataPrevisaoEntrega();
		this.dataEntrega = entidade.getDataEntrega();
		this.diarias = entidade.getDiarias();
		this.valorDiaria = entidade.getValorDiaria();
		this.valorLocacao = entidade.getValorLocacao();
		
	}
	
	
	

	public LocacaoDto getLocacaoDto() {
		return locacaoDto;
	}

	public void setLocacaoDto(LocacaoDto locacaoDto) {
		this.locacaoDto = locacaoDto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataPrevisaoEntrega() {
		return dataPrevisaoEntrega;
	}

	public void settDataPrevisaoEntrega(Date dataPrevisaoEntrega) {
		this.dataPrevisaoEntrega = dataPrevisaoEntrega;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
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

	public Double getvalorLocacao() {
		return valorLocacao;
	}

	public void setvalorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	
	
	
	
	
	
	
	
	
	
}
