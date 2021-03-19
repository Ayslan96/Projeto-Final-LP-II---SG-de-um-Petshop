package br.ufrn.imd.modelo;

public class Reptil extends Animal{
	
	boolean venoso;
	String tipoVeneno;
	public boolean isVenoso() {
		return venoso;
	}
	public void setVenoso(boolean venoso) {
		this.venoso = venoso;
	}
	public String getTipoVeneno() {
		return tipoVeneno;
	}
	public void setTipoVeneno(String tipoVeneno) {
		this.tipoVeneno = tipoVeneno;
	}
	
	

}
