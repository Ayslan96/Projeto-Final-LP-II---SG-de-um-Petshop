package br.ufrn.imd.modelo;

public class AnfibioNativo extends Anfibio{

	String ufOrigem;

	public String getUfOrigem() {
		return ufOrigem;
	}

	public void setUfOrigem(String ufOrigem) {
		this.ufOrigem = ufOrigem;
	}
	
	
	@Override
	public String toString() {
		return "##############################################"+"\nNome: " + this.getNomeBatismo() +"\nId: " + this.getId()+
				"\nVeterinario: " + this.getVeterinario() + "\nTratador: " + this.getTratador()+ "\nAutoriza��o IBAMA: "+ 
				this.getAutorizacaoIbama() + "\nTamanho: " + this.getTamanho() + "\nDieta: " + this.getDieta()
				+ "\nClasse: " + this.getClasse() + "\nSexo: " + this.getSexo() + "\nNome Cient�fico: " + this.getNomeCientifico()+
				"\nTotal de Mudas: " + this.getTotalDeMudas() + "\n�ltima Muda: "+ this.getUltimaMuda() +
				"\nUF de Origem: " + this.getUfOrigem()
				+"\n##############################################";
	}
	
	
}
