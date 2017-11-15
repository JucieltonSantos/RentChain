package br.com.smartrent.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "aluguel_executado")
public class AluguelExecutado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5929851694476991929L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String txRegistro;
	
	@OneToOne
	@NotNull
	private Usuario locador;
	
	@OneToOne
	@NotNull
	private Usuario locatario;
	
	@OneToOne
	@NotNull
	private Imovel imovel;
	
	@OneToOne
	@NotNull
	private Segmento segmento;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date txData;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTxRegistro() {
		return txRegistro;
	}

	public void setTxRegistro(String txRegistro) {
		this.txRegistro = txRegistro;
	}

	

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Segmento getSegmento() {
		return segmento;
	}

	public void setSegmento(Segmento segmento) {
		this.segmento = segmento;
	}

	public Date getTxData() {
		return txData;
	}

	public void setTxData(Date txData) {
		this.txData = txData;
	}
	
	public Usuario getLocador() {
		return locador;
	}

	public void setLocador(Usuario locador) {
		this.locador = locador;
	}

	public Usuario getLocatario() {
		return locatario;
	}

	public void setLocatario(Usuario locatario) {
		this.locatario = locatario;
	}

	public AluguelExecutado() {}

	public AluguelExecutado(String txRegistro, Usuario usuarioLocador, Usuario usuarioLocatario, Imovel imovel,
			Segmento segmento, Date txData) {
		super();
		this.txRegistro = txRegistro;
		this.locador = usuarioLocador;
		this.locatario = usuarioLocatario;
		this.imovel = imovel;
		this.segmento = segmento;
		this.txData = txData;
	} 
	
	
	

}
