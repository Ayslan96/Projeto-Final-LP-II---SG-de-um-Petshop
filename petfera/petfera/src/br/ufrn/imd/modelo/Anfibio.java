package br.ufrn.imd.modelo;
import java.util.Calendar;

public class Anfibio extends Animal{
	
	int totalDeMudas;
	Calendar ultimaMuda;
	
	public int getTotalDeMudas() {
		return totalDeMudas;
	}
	public void setTotalDeMudas(int totalDeMudas) {
		this.totalDeMudas = totalDeMudas;
	}
	public Calendar getUltimaMuda() {
		return ultimaMuda;
	}
	public void setUltimaMuda(Calendar ultimaMuda) {
		this.ultimaMuda = ultimaMuda;
	}
	
	

}
