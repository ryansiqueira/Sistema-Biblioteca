package mjv.devschool.sistemalivaria.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_locacao")
public class Locacao implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private Date dataAgendamento;
	private Date dataRetirada;
	private Date finalizacao;
	private Double valorTotal;
	
	private LocacaoStatus status = LocacaoStatus.RESERVADO;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cadastro_id",referencedColumnName = "id")
	Cadastro cadastro = new Cadastro();
	
	
	
	
	/*@JoinTable(name = "tb_locacao_locacaoItem",
	joinColumns = @JoinColumn(name = "locacao_id" ),
	inverseJoinColumns = @JoinColumn(name = "locacaoItem_id"))*/
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "locacaoitem_id", referencedColumnName="id")
	LocacaoItem locacaoitem = new LocacaoItem();
 	
	
	public LocacaoStatus getStatus() {
		return status;
	}

	public void setStatus(LocacaoStatus status) {
		this.status = status;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public LocacaoItem getLocacaoitem() {
		return locacaoitem;
	}

	public void setLocacaoitem(LocacaoItem locacaoitem) {
		this.locacaoitem = locacaoitem;
	}

	public Locacao() {
		
	}
	
	public Locacao(Long id, Date dataAgendamento, Date dataRetirada, Date finalizacao, Double valorTotal , LocacaoStatus status ) {
	
		this.id = id;
		this.dataAgendamento = dataAgendamento;
		this.dataRetirada = dataRetirada;
		this.finalizacao = finalizacao;
		this.valorTotal = valorTotal;
		this.status = status;
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
