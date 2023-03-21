package com.back.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bodega")
public class Bodega {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBodega;

	@Column(name = "identification", unique = true, length = 10)
	private Integer identification;
	
	@Column(name = "id_us")
	private Integer idUs;

	@Column(name = "names", length = 120)
	private String names;

	@Column(name = "bodega_descript", length = 120)
	private String bodegaDescript;

	@Column(name = "estado", length = 100)
	private String estado;
	
	@Column(name = "numero_bodega")
	private Integer numeroBodega;
    
	public Integer getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}

	public Integer getIdentification() {
		return identification;
	}

	public void setIdentification(Integer identification) {
		this.identification = identification;
	}

	public Integer getIdUs() {
		return idUs;
	}

	public void setIdUs(Integer idUs) {
		this.idUs = idUs;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getBodegaDescript() {
		return bodegaDescript;
	}

	public void setBodegaDescript(String bodegaDescript) {
		this.bodegaDescript = bodegaDescript;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getNumeroBodega() {
		return numeroBodega;
	}

	public void setNumeroBodega(Integer numeroBodega) {
		this.numeroBodega = numeroBodega;
	}
}
