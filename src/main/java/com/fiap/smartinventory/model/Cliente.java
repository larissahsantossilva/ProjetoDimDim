package com.fiap.smartinventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
@SequenceGenerator(sequenceName = "SEQ_CLIENTE", name = "cliente", initialValue = 1, allocationSize = 1)
public class Cliente {

	@Id
	@GeneratedValue(generator = "cliente", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "nm_cliente", nullable = false)
	private String nome;
	
	@Column(name = "ds_endereco", nullable = false)
	private String endereco;
	
	@Column(name = "ds_email", nullable = false)
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente(Long id, String nome, String endereco, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	public Cliente() {
	}
}
