package br.com.smartrent.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class Usuario implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 2786279767323934479L;

	// The entity fields (private)  

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String email;

	@NotNull
	private String name;


	private String wallet;



	// Public methods

	public Usuario() { }

	public Usuario(long id) { 
		this.id = id;
	}

	public Usuario(String email, String name, String wallet) {
		this.email = email;
		this.name = name;
		this.wallet = wallet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWallet() {
		return wallet;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}



}