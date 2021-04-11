package br.ufrn.imd.modelo;

public class Veterinario extends Funcionario{
	
	String cnmv;

	public String getCnmv() {
		return cnmv;
	}

	public void setCnmv(String cnmv) {
		this.cnmv = cnmv;
	}
	
	@Override
	public String toString() {
		return "##############################################"+"\nNome: " + this.getNome() + "\nId: " + this.getId() + "\nCNMV: "+ this.getCnmv() +"\nEspecialidade: "
				+ this.getEspecialidade() +"\nCPF: "+ this.getCpf() + "\nTipo Sanguíneo: "+ this.getTipoSanguineo()
				+ "\nFator RH: " + this.getFatorRH() + "\nIdade: "+ this.getIdade() + "\n##############################################";
	}
	
}
