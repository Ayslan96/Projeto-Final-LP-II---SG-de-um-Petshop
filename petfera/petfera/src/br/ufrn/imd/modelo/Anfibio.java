package br.ufrn.imd.modelo;
import java.util.Calendar;

public class Anfibio extends Animal{
	
	int totalDeMudas;
	Calendar ultimaMudaa;
	
	public int getTotalDeMudas() {
		return totalDeMudas;
	}
	public void setTotalDeMudas(int totalDeMudas) {
		this.totalDeMudas = totalDeMudas;
	}
	public Calendar getUltimaMuda() {
		return ultimaMudaa;
	}
	public void setUltimaMuda(Calendar ultimaMuda) {
		this.ultimaMudaa = ultimaMuda;
	}
	
	

}
