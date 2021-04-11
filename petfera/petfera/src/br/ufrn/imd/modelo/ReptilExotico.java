package br.ufrn.imd.modelo;

public class ReptilExotico extends Reptil{

	String paisOrigem;
	String cidadeOrigem;
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getCidadeOrigem() {
		return cidadeOrigem;
	}
	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}
	
	@Override
	public String toString() {
		
		String temp;
        temp  = (this.isVenoso())? "Sim": "Não";
        
		return "##############################################"+"\nNome: " + this.getNomeBatismo() +"\nId: " + this.getId()+
				"\nVeterinario: " + this.getVeterinario() + "\nTratador: " + this.getTratador()+ "\nAutorização IBAMA: "+ 
				this.getAutorizacaoIbama() + "\nTamanho: " + this.getTamanho() + "\nDieta: " + this.getDieta()
				+ "\nClasse: " + this.getClasse() + "\nSexo: " + this.getSexo() + "\nNome Científico: " + this.getNomeCientifico()+
				"\nVenenoso: "+ temp + "\nTipo Veneno: " + this.getTipoVeneno() + "\nPaís de Origem: "+
				this.getPaisOrigem() + "\nCidade de Origem: " + this.getCidadeOrigem() 
				+"\n##############################################";
	}
	
}
