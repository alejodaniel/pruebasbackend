package com.back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Precio_Detalle")
public class PrecioDetalle {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Precio_Detalle")
	private Integer idPrecioDetalle;
	
	public Integer getIdPrecioDetalle() {
		return idPrecioDetalle;
	}

	public void setIdPrecioDetalle(Integer idPrecioDetalle) {
		this.idPrecioDetalle = idPrecioDetalle;
	}

	public Integer getIdPrecio() {
		return idPrecio;
	}

	public void setIdPrecio(Integer idPrecio) {
		this.idPrecio = idPrecio;
	}

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Double getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(Double utilidad) {
		this.utilidad = utilidad;
	}

	public Double getPrecioBruto() {
		return precioBruto;
	}

	public void setPrecioBruto(Double precioBruto) {
		this.precioBruto = precioBruto;
	}

	public String getDescuentoPorcent() {
		return descuentoPorcent;
	}

	public void setDescuentoPorcent(String descuentoPorcent) {
		this.descuentoPorcent = descuentoPorcent;
	}

	public Double getDescuentoValor() {
		return descuentoValor;
	}

	public void setDescuentoValor(Double descuentoValor) {
		this.descuentoValor = descuentoValor;
	}

	public Double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(Double impuestos) {
		this.impuestos = impuestos;
	}

	public Double getPrecioNeto() {
		return precioNeto;
	}

	public void setPrecioNeto(Double precioNeto) {
		this.precioNeto = precioNeto;
	}

	public Double getSubsidio() {
		return subsidio;
	}

	public void setSubsidio(Double subsidio) {
		this.subsidio = subsidio;
	}

	public Double getCantidadMinima() {
		return cantidadMinima;
	}

	public void setCantidadMinima(Double cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}

	public Double getEquivalencia() {
		return equivalencia;
	}

	public void setEquivalencia(Double equivalencia) {
		this.equivalencia = equivalencia;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	@Column(name = "id_precio")
	private Integer idPrecio;

    @Column(name = "id_detalle")
	private Integer idDetalle;

	@Column(name = "utilidad")
	private Double utilidad;

    @Column(name = "precio_bruto")
	private Double precioBruto;

	@Column(name = "descuento_porcent", length = 120)
	private String descuentoPorcent;

    @Column(name = "descuento_valor")
	private Double descuentoValor;

	@Column(name = "impuestos")
	private Double impuestos;

    @Column(name = "precio_neto")
	private Double precioNeto;

	@Column(name = "subsidio")
	private Double subsidio;

    @Column(name = "cantidad_minima")
	private Double cantidadMinima;

	@Column(name = "equivalencia")
	private Double equivalencia;

    @Column(name = "costo")
	private Double costo;	
    
}
