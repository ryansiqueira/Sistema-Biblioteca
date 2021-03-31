package mjv.devschool.sistemalivaria.dto;

import java.io.Serializable;
import java.util.Date;

import mjv.devschool.sistemalivaria.model.Locacao;
import mjv.devschool.sistemalivaria.model.LocacaoStatus;

public class LocacaoDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Date dataAgendamento;
	private Date dataRetirada;
	private Date finalizacao;
	private Double valorTotal;
	
	private LocacaoStatus status = LocacaoStatus.RESERVADO;


	public LocacaoDto() {
		
	}
	
	public LocacaoDto(Long id, Date dataAgendamento, Date dataRetirada, Date finalizacao, Double valorTotal , LocacaoStatus status ) {
		
		this.id = id;
		this.dataAgendamento = dataAgendamento;
		this.dataRetirada = dataRetirada;
		this.finalizacao = finalizacao;
		this.valorTotal = valorTotal;
		
	}
	
	public LocacaoDto (Locacao entidade) {
		this.id = entidade.getId();
		this.dataAgendamento = entidade.getDataAgendamento();
		this.dataRetirada = entidade.getDataRetirada();
		this.finalizacao = entidade.getFinalizacao();
		this.valorTotal = entidade.getValorTotal();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public Date getFinalizacao() {
		return finalizacao;
	}

	public void setFinalizacao(Date finalizacao) {
		this.finalizacao = finalizacao;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

}
