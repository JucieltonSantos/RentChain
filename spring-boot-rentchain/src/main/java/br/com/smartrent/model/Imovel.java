package br.com.smartrent.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "imovel")
public class Imovel implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = -4155497085644454698L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	
	@OneToOne
	private Usuario locatario;
	
	@NotNull
	private long metrosQuadrados;
	
	@NotNull
	private float valor;
	
	@NotNull
	private float latitude;
	
	@NotNull
	private float longitude;
	
	public Imovel() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMetrosQuadrados() {
		return metrosQuadrados;
	}

	public void setMetrosQuadrados(long metrosQuadrados) {
		this.metrosQuadrados = metrosQuadrados;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public Usuario getLocatario() {
		return locatario;
	}

	public void setLocatario(Usuario locatario) {
		this.locatario = locatario;
	}

	public Imovel(Usuario locatario, long metrosQuadrados, float valor, float latitude, float longitude) {
		super();
		this.locatario = locatario;
		this.metrosQuadrados = metrosQuadrados;
		this.valor = valor;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	
	
	

	
	
}
