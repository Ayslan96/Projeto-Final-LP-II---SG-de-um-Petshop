package br.ufrn.imd.modelo;

public class Tratador extends Funcionario {
	
	int nivelDeSegurança;

	public int getNivelDeSegurança() {
		return nivelDeSegurança;
	}

	public void setNivelDeSegurança(int nivelDeSegurança) {
		this.nivelDeSegurança = nivelDeSegurança;
	}
	
	@Override
	public String toString() {
		return "##############################################"+"\nNome: " + this.getNome() + "\nId: " 
	            + this.getId() + "\nNivel de Segurança: "+ this.getNivelDeSegurança() +"\nEspecialidade: "
				+ this.getEspecialidade() +"\nCPF: "+ this.getCpf() + "\nTipo Sanguíneo: "+ this.getTipoSanguineo()
				+ "\nFator RH: " + this.getFatorRH() + "\nIdade: "+ this.getIdade() + "\n##############################################";
	}

}
