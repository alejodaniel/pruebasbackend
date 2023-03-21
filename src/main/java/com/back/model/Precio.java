package com.back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Precio")
public class Precio {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPrecio;
	
	@Column(name = "id_us")
	private Integer idUs;

	public Integer getIdPrecio() {
		return idPrecio;
	}

	public void setIdPrecio(Integer idPrecio) {
		this.idPrecio = idPrecio;
	}

	public Integer getIdUs() {
		return idUs;
	}

	public void setIdUs(Integer idUs) {
		this.idUs = idUs;
	}

	public String getPrecioDescri() {
		return precioDescri;
	}

	public void setPrecioDescri(String precioDescri) {
		this.precioDescri = precioDescri;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "precio_descri", length = 120)
	private String precioDescri;
	
	@Column(name = "estado")
	private Integer estado;
    
}
