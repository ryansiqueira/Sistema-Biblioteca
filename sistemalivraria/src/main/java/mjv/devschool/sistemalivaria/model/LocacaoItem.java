package mjv.devschool.sistemalivaria.model;
		

		import java.io.Serializable;
		import java.util.Date;
		

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
		

			private Date dataPrevisaoEntrega;
			private Date dataEntrega;
			private long diarias;
			private Double valorDiaria;
			private Double valorLocacao;
		

		

		

			@ManyToOne
			@JoinColumn(name = "livros_id")
			Livro livro = new Livro();
		

		

			public LocacaoItem() {
		

			}
		

			public LocacaoItem(Long id, Date dataPrevisaoEntrega, Date dataEntrega, long diarias, Double valorDiaria, Double valorLocacao) {
		

				this.id = id;
				this.dataPrevisaoEntrega = dataPrevisaoEntrega;
				this.dataEntrega = dataEntrega;
				this.diarias = diarias;
				this.valorDiaria = valorDiaria;
				this.valorLocacao = valorLocacao;
			}
		

			public Livro getLivro() {
				return livro;
			}
		

			public void setLivro(Livro livro) {
				this.livro = livro;
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
		

			public void setDataPrevisaoEntrega(Date dataPrevisaoEntrega) {
				this.dataPrevisaoEntrega = dataPrevisaoEntrega;
			}
		

			public Date getDataEntrega() {
				return dataEntrega;
			}
		

			public void setDataEntrega(Date dataEntrega) {
				this.dataEntrega = dataEntrega;
			}
		

			public long getDiarias() {
				return diarias;
			}
		

			public void setDiarias(long diarias) {
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
