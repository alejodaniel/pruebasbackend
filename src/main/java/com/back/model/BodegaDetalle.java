package com.back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bodega_Detalle")
public class BodegaDetalle {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Bodega_Detalle")
	private Integer idBodegaDetalle;
	
	@Column(name = "id_bodega")
	private Integer idBodega;

    @Column(name = "id_detalle")
	private Integer idDetalle;

	@Column(name = "stock_min")
	private Double stockMin;

	public Integer getIdBodegaDetalle() {
		return idBodegaDetalle;
	}

	public void setIdBodegaDetalle(Integer idBodegaDetalle) {
		this.idBodegaDetalle = idBodegaDetalle;
	}

	public Integer getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Double getStockMin() {
		return stockMin;
	}

	public void setStockMin(Double stockMin) {
		this.stockMin = stockMin;
	}

	public Double getStockMax() {
		return stockMax;
	}

	public void setStockMax(Double stockMax) {
		this.stockMax = stockMax;
	}

	public Double getExistenciasCalc() {
		return existenciasCalc;
	}

	public void setExistenciasCalc(Double existenciasCalc) {
		this.existenciasCalc = existenciasCalc;
	}

	public Double getDiferencia() {
		return diferencia;
	}

	public void setDiferencia(Double diferencia) {
		this.diferencia = diferencia;
	}

	public Double getExistencias() {
		return existencias;
	}

	public void setExistencias(Double existencias) {
		this.existencias = existencias;
	}

	@Column(name = "stock_max")
	private Double stockMax;
	
	@Column(name = "existencias_calc")
	private Double existenciasCalc;

    @Column(name = "diferencia")
	private Double diferencia;
    
    @Column(name = "existencias")
	private Double existencias;
    
}
