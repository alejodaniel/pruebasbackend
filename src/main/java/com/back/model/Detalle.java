package com.back.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Detalle")
public class Detalle {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Detalle")
	private Integer idDetalle;

	@Column(name = "cantidad_exist", length = 120)
	private Double CantidadExist;
	
	@Column(name = "cantidad_Exist_Calc")
	private Double CantidadExistCalc;

    @Column(name = "cant_Exist_proceso")
	private Double CantExist_Proceso;

	@Column(name = "cant_Exist_transito")
	private Double CantExist_Transito;

	@Column(name = "cod_Auxiliar", length =45 )
	private String codAuxiliar;

	@Column(name = "cod_Barras", length =225 )
	private String codBarras;

	@Column(name = "detall_Adicional", length =45 )
	private String detallAdicional;

	@Column(name = "medida", length =15 )
	private String medida;

	@Column(name = "nombre", length =500 )
	private String nombre;

	@Column(name = "nombre_simple", length =255)
	private String nombreSimple;

	@Column(name = "id_Us")
	private Integer idUs;

	@Column(name = "precio_comp")
	private Double PrecioComp;

	@Column(name = "precio_comp_neto")
	private Double PrecioComp_Neto;
	
	@Column(name = "utilidad_normal")
	private Double utilidadNormal;

	@Column(name = "utilidad_mayor")
	private Double utilidadFracion;

	@Column(name = "utilidad_fraccion")
	private Double utilidadFraccion;
	
	@Column(name = "descuento")
	private Double descuento;

	@Column(name = "descuento_valor")
	private Double descuentoValor;

    @Column(name = "precio_vent")
	private Double precioVent;

	@Column(name = "precio_vent_neto")
	private Double precioVent_Neto;

	@Column(name = "precio_vent_mayor")
	private Double precioVent_Mayor;

	@Column(name = "precio_vent_detal")
	private Double precioVent_Detal;

	@Column(name = "id_marca")
	private Integer idMarca;

	@Column(name = "id_tmed")
	private Integer idTMed;
	
	@Column(name = "tipo_operacion", length = 1)
	private String TipoOperacion;

	@Column(name = "id_tipo_detalle", length = 1)
	private String idTipoDetalle;

	@Column(name = "id_forma_pago", length = 11)
	private String idFormaPago;

	@Column(name = "det_forma_pago", length = 11)
	private String detFormaPago;

	@Column(name = "estado")
	private Integer estado;

	@Column(name = "subsidio")
	private Double subsidio;

	@Column(name = "fecha_registro")
	private Date FechaRegistro;

	@Column(name = "fecha_modif")
	private Date FechaModif;

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Double getCantidadExist() {
		return CantidadExist;
	}

	public void setCantidadExist(Double cantidadExist) {
		CantidadExist = cantidadExist;
	}

	public Double getCantidadExistCalc() {
		return CantidadExistCalc;
	}

	public void setCantidadExistCalc(Double cantidadExistCalc) {
		CantidadExistCalc = cantidadExistCalc;
	}

	public Double getCantExist_Proceso() {
		return CantExist_Proceso;
	}

	public void setCantExist_Proceso(Double cantExist_Proceso) {
		CantExist_Proceso = cantExist_Proceso;
	}

	public Double getCantExist_Transito() {
		return CantExist_Transito;
	}

	public void setCantExist_Transito(Double cantExist_Transito) {
		CantExist_Transito = cantExist_Transito;
	}

	public String getCodAuxiliar() {
		return codAuxiliar;
	}

	public void setCodAuxiliar(String codAuxiliar) {
		this.codAuxiliar = codAuxiliar;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getDetallAdicional() {
		return detallAdicional;
	}

	public void setDetallAdicional(String detallAdicional) {
		this.detallAdicional = detallAdicional;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreSimple() {
		return nombreSimple;
	}

	public void setNombreSimple(String nombreSimple) {
		this.nombreSimple = nombreSimple;
	}

	public Integer getIdUs() {
		return idUs;
	}

	public void setIdUs(Integer idUs) {
		this.idUs = idUs;
	}

	public Double getPrecioComp() {
		return PrecioComp;
	}

	public void setPrecioComp(Double precioComp) {
		PrecioComp = precioComp;
	}

	public Double getPrecioComp_Neto() {
		return PrecioComp_Neto;
	}

	public void setPrecioComp_Neto(Double precioComp_Neto) {
		PrecioComp_Neto = precioComp_Neto;
	}

	public Double getUtilidadNormal() {
		return utilidadNormal;
	}

	public void setUtilidadNormal(Double utilidadNormal) {
		this.utilidadNormal = utilidadNormal;
	}

	public Double getUtilidadFracion() {
		return utilidadFracion;
	}

	public void setUtilidadFracion(Double utilidadFracion) {
		this.utilidadFracion = utilidadFracion;
	}

	public Double getUtilidadFraccion() {
		return utilidadFraccion;
	}

	public void setUtilidadFraccion(Double utilidadFraccion) {
		this.utilidadFraccion = utilidadFraccion;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getDescuentoValor() {
		return descuentoValor;
	}

	public void setDescuentoValor(Double descuentoValor) {
		this.descuentoValor = descuentoValor;
	}

	public Double getPrecioVent() {
		return precioVent;
	}

	public void setPrecioVent(Double precioVent) {
		this.precioVent = precioVent;
	}

	public Double getPrecioVent_Neto() {
		return precioVent_Neto;
	}

	public void setPrecioVent_Neto(Double precioVent_Neto) {
		this.precioVent_Neto = precioVent_Neto;
	}

	public Double getPrecioVent_Mayor() {
		return precioVent_Mayor;
	}

	public void setPrecioVent_Mayor(Double precioVent_Mayor) {
		this.precioVent_Mayor = precioVent_Mayor;
	}

	public Double getPrecioVent_Detal() {
		return precioVent_Detal;
	}

	public void setPrecioVent_Detal(Double precioVent_Detal) {
		this.precioVent_Detal = precioVent_Detal;
	}

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public Integer getIdTMed() {
		return idTMed;
	}

	public void setIdTMed(Integer idTMed) {
		this.idTMed = idTMed;
	}

	public String getTipoOperacion() {
		return TipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		TipoOperacion = tipoOperacion;
	}

	public String getIdTipoDetalle() {
		return idTipoDetalle;
	}

	public void setIdTipoDetalle(String idTipoDetalle) {
		this.idTipoDetalle = idTipoDetalle;
	}

	public String getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(String idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getDetFormaPago() {
		return detFormaPago;
	}

	public void setDetFormaPago(String detFormaPago) {
		this.detFormaPago = detFormaPago;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Double getSubsidio() {
		return subsidio;
	}

	public void setSubsidio(Double subsidio) {
		this.subsidio = subsidio;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	public Date getFechaModif() {
		return FechaModif;
	}

	public void setFechaModif(Date fechaModif) {
		FechaModif = fechaModif;
	}

	public String getIVA() {
		return IVA;
	}

	public void setIVA(String iVA) {
		IVA = iVA;
	}

	public String getICE() {
		return ICE;
	}

	public void setICE(String iCE) {
		ICE = iCE;
	}

	public String getIRBPNR() {
		return IRBPNR;
	}

	public void setIRBPNR(String iRBPNR) {
		IRBPNR = iRBPNR;
	}

	public String getISD() {
		return ISD;
	}

	public void setISD(String iSD) {
		ISD = iSD;
	}

	public String getR_IVA() {
		return R_IVA;
	}

	public void setR_IVA(String r_IVA) {
		R_IVA = r_IVA;
	}

	public String getR_FUENTE() {
		return R_FUENTE;
	}

	public void setR_FUENTE(String r_FUENTE) {
		R_FUENTE = r_FUENTE;
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

	public Integer getCompraIncluyelmp() {
		return compraIncluyelmp;
	}

	public void setCompraIncluyelmp(Integer compraIncluyelmp) {
		this.compraIncluyelmp = compraIncluyelmp;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public Integer getEstablecieminto() {
		return establecieminto;
	}

	public void setEstablecieminto(Integer establecieminto) {
		this.establecieminto = establecieminto;
	}

	public Integer getBodega() {
		return bodega;
	}

	public void setBodega(Integer bodega) {
		this.bodega = bodega;
	}

	public Integer getDeducible() {
		return deducible;
	}

	public void setDeducible(Integer deducible) {
		this.deducible = deducible;
	}

	public Integer getSel() {
		return sel;
	}

	public void setSel(Integer sel) {
		this.sel = sel;
	}

	public Integer getSimilitud() {
		return similitud;
	}

	public void setSimilitud(Integer similitud) {
		this.similitud = similitud;
	}

	public Double getCantidadDiv() {
		return cantidadDiv;
	}

	public void setCantidadDiv(Double cantidadDiv) {
		this.cantidadDiv = cantidadDiv;
	}

	public Integer getUsaPrecioVent_Mayor() {
		return usaPrecioVent_Mayor;
	}

	public void setUsaPrecioVent_Mayor(Integer usaPrecioVent_Mayor) {
		this.usaPrecioVent_Mayor = usaPrecioVent_Mayor;
	}

	public Integer getUsaPrecioVent_Detal() {
		return usaPrecioVent_Detal;
	}

	public void setUsaPrecioVent_Detal(Integer usaPrecioVent_Detal) {
		this.usaPrecioVent_Detal = usaPrecioVent_Detal;
	}

	public Integer getMinPrecioVent_Mayor() {
		return minPrecioVent_Mayor;
	}

	public void setMinPrecioVent_Mayor(Integer minPrecioVent_Mayor) {
		this.minPrecioVent_Mayor = minPrecioVent_Mayor;
	}

	public String getCtaBalGeneal() {
		return ctaBalGeneal;
	}

	public void setCtaBalGeneal(String ctaBalGeneal) {
		this.ctaBalGeneal = ctaBalGeneal;
	}

	public String getCtaBalResult() {
		return ctaBalResult;
	}

	public void setCtaBalResult(String ctaBalResult) {
		this.ctaBalResult = ctaBalResult;
	}

	public String getCtaFlujoEfect() {
		return ctaFlujoEfect;
	}

	public void setCtaFlujoEfect(String ctaFlujoEfect) {
		this.ctaFlujoEfect = ctaFlujoEfect;
	}

	public String getCtaCambPatrim() {
		return ctaCambPatrim;
	}

	public void setCtaCambPatrim(String ctaCambPatrim) {
		this.ctaCambPatrim = ctaCambPatrim;
	}

	public String getIdCta() {
		return idCta;
	}

	public void setIdCta(String idCta) {
		this.idCta = idCta;
	}

	public Integer getIdPerson() {
		return IdPerson;
	}

	public void setIdPerson(Integer idPerson) {
		IdPerson = idPerson;
	}

	public Double getImpPorcentaje() {
		return impPorcentaje;
	}

	public void setImpPorcentaje(Double impPorcentaje) {
		this.impPorcentaje = impPorcentaje;
	}

	public String getCodigoSRI() {
		return codigoSRI;
	}

	public void setCodigoSRI(String codigoSRI) {
		this.codigoSRI = codigoSRI;
	}

	public Integer getSel2() {
		return sel2;
	}

	public void setSel2(Integer sel2) {
		this.sel2 = sel2;
	}

	public String getImagenes() {
		return imagenes;
	}

	public void setImagenes(String imagenes) {
		this.imagenes = imagenes;
	}

	public Integer getPublicarWeb() {
		return publicarWeb;
	}

	public void setPublicarWeb(Integer publicarWeb) {
		this.publicarWeb = publicarWeb;
	}

	public Double getPrecio_Vent_Mayor_Neto() {
		return Precio_Vent_Mayor_Neto;
	}

	public void setPrecio_Vent_Mayor_Neto(Double precio_Vent_Mayor_Neto) {
		Precio_Vent_Mayor_Neto = precio_Vent_Mayor_Neto;
	}

	public Double getDiferencia() {
		return diferencia;
	}

	public void setDiferencia(Double diferencia) {
		this.diferencia = diferencia;
	}

	public Integer getIdDetallePadre() {
		return IdDetallePadre;
	}

	public void setIdDetallePadre(Integer idDetallePadre) {
		IdDetallePadre = idDetallePadre;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Double getEquivalencia() {
		return equivalencia;
	}

	public void setEquivalencia(Double equivalencia) {
		this.equivalencia = equivalencia;
	}

	public String getIdCtaVentas() {
		return idCtaVentas;
	}

	public void setIdCtaVentas(String idCtaVentas) {
		this.idCtaVentas = idCtaVentas;
	}

	public String getIdCtaInventario() {
		return idCtaInventario;
	}

	public void setIdCtaInventario(String idCtaInventario) {
		this.idCtaInventario = idCtaInventario;
	}

	public Integer getIsGenerico() {
		return isGenerico;
	}

	public void setIsGenerico(Integer isGenerico) {
		this.isGenerico = isGenerico;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Column(name = "iva", length = 8)
	private String IVA;

	@Column(name = "ice", length = 8)
	private String ICE;

	@Column(name = "irbpnr", length = 8)
	private String IRBPNR;

	@Column(name = "isd", length = 8)
	private String ISD;

	@Column(name = "r_iva", length = 120)
	private String R_IVA;

	@Column(name = "r_fuente", length = 120)
	private String R_FUENTE;

	@Column(name = "stock_min")
	private Double stockMin;

	@Column(name = "stock_max")
	private Double stockMax;

	@Column(name = "compra_incluy_el_mp")
	private Integer compraIncluyelmp;

	@Column(name = "observacion", length = 300)
	private String Observacion;

	@Column(name = "establecimiento")
	private Integer establecieminto;

	@Column(name = "bodega")
	private Integer bodega;

	@Column(name = "deducible")
	private Integer deducible;

	@Column(name = "sel")
	private Integer sel;

	@Column(name = "similitud")
	private Integer similitud;

	@Column(name = "cantidad_div")
	private Double cantidadDiv;

	@Column(name = "usa_precio_venta_mayor")
	private Integer usaPrecioVent_Mayor;

	@Column(name = "usa_precio_venta_detal")
	private Integer usaPrecioVent_Detal;

	@Column(name = "min_precio_venta_mayor")
	private Integer minPrecioVent_Mayor;

	@Column(name = "cta_bal_geneal", length = 18)
	private String ctaBalGeneal;

	@Column(name = "cta_bal_result", length = 18)
	private String ctaBalResult;

	@Column(name = "cta_flujo_efect", length = 18)
	private String ctaFlujoEfect;

	@Column(name = "cta_camb_patrim", length = 18)
	private String ctaCambPatrim;

	@Column(name = "id_cta", length = 18)
	private String idCta;

	@Column(name = "id_persona")
	private Integer IdPerson;
	
	@Column(name = "imp_porcentaje")
	private Double impPorcentaje;

	@Column(name = "codigo_sri", length = 8)
	private String codigoSRI;

	@Column(name = "sel_2")
	private Integer sel2;

	@Column(name = "imagenes", length = 1000)
	private String imagenes;

	@Column(name = "Publicar_web")
	private Integer publicarWeb;

	@Column(name = "precio_venta_mayor_neto")
	private Double Precio_Vent_Mayor_Neto;

	@Column(name = "diferencia")
	private Double diferencia;

	@Column(name = "id_detalle_padre")
	private Integer IdDetallePadre;

	@Column(name = "tipo_producto", length = 120)
	private String tipoProducto;

	@Column(name = "equivalencia")
	private Double equivalencia;

	@Column(name = "id_cta_ventas", length = 18)
	private String idCtaVentas;

	@Column(name = "id_cta_inventario", length = 18)
	private String idCtaInventario;

	@Column(name = "is_generico")
	private Integer isGenerico;

	@Column(name = "foto", length = 250)
	private String foto;

}
