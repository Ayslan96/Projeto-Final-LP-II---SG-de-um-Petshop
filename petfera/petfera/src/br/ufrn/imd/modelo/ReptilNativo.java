package br.ufrn.imd.modelo;

public class ReptilNativo extends Reptil{

	String ufOrigem;

	public String getUfOrigem() {
		return ufOrigem;
	}

	public void setUfOrigem(String ufOrigem) {
		this.ufOrigem = ufOrigem;
	}
	
	@Override
	public String toString() {
		
		String temp;
        temp  = (this.isVenoso())? "Sim": "Não";
        
		return "##############################################"+"\nNome: " + this.getNomeBatismo() +"\nId: " + this.getId()+
				"\nVeterinario: " + this.getVeterinario() + "\nTratador: " + this.getTratador()+ "\nAutorização IBAMA: "+ 
				this.getAutorizacaoIbama() + "\nTamanho: " + this.getTamanho() + "\nDieta: " + this.getDieta()
				+ "\nClasse: " + this.getClasse() + "\nSexo: " + this.getSexo() + "\nNome Científico: " + this.getNomeCientifico()+
				"\nVenenoso: "+ temp + "\nTipo Veneno: " + this.getTipoVeneno() + "\nUF de Origem: "+
				this.getUfOrigem() 
				+"\n##############################################";
	}
}
