package modelo;

import java.util.Date;

public class Institucion {
	
	private Long id;
	private String nombre;
	private String tipo;
	private Date fechaFundacion;
	private Boolean acreditada;
	
	public Institucion(){
		
	}
	
	public Institucion(String n, String t, Date f, Boolean a){
		this.nombre = n;
		this.tipo = t;
		this.fechaFundacion = f;
		this.acreditada = a;		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public Boolean getAcreditada() {
		return acreditada;
	}
	public void setAcreditada(Boolean acreditada) {
		this.acreditada = acreditada;
	}
}
