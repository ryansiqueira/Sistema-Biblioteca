package mjv.devschool.sistemalivaria.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mjv.devschool.sistemalivaria.model.Locacao;
import mjv.devschool.sistemalivaria.model.LocacaoStatus;

public class LocacaoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Date dataAgendamento;
	private Date dataRetirada;
	private Date finalizacao;
	private Double valorTotal;
	private LocacaoStatus status;
	private Integer idCadastro;
	public Integer getIdCadastro() {
		return idCadastro;
	}
	public void setIdCadastro(Integer idCadastro) {
		this.idCadastro = idCadastro;
	}
	List<LocacaoItemDto> locacaoitemsdto = new ArrayList<LocacaoItemDto>();


	public List<LocacaoItemDto> getLocacaoitemsdto() {
		return locacaoitemsdto;
	}

	public void setLocacaoitemsdto(List<LocacaoItemDto> locacaoitemsdto) {
		this.locacaoitemsdto = locacaoitemsdto;
	}

	public LocacaoDto() {


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