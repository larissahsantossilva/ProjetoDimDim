package com.fiap.smartinventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VENDA")
@SequenceGenerator(sequenceName = "SEQ_VENDA", name = "venda", initialValue = 1, allocationSize = 1)
public class Venda {

	@Id
	@GeneratedValue(generator = "venda", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "nm_item", nullable = false)
	private String item;

	@Column(name = "vl_venda", nullable = false)
	private double valor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Venda(Long id, String item, double valor) {
		super();
		this.id = id;
		this.item = item;
		this.valor = valor;
	}
	
	
	public Venda() {
		
	}
}
