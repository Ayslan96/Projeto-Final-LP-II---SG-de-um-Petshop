package br.ufrn.imd.modelo;

public class Tratador extends Funcionario {
	
	int nivelDeSeguran�a;

	public int getNivelDeSeguran�a() {
		return nivelDeSeguran�a;
	}

	public void setNivelDeSeguran�a(int nivelDeSeguran�a) {
		this.nivelDeSeguran�a = nivelDeSeguran�a;
	}
	
	@Override
	public String toString() {
		return "##############################################"+"\nNome: " + this.getNome() + "\nId: " 
	            + this.getId() + "\nNivel de Seguran�a: "+ this.getNivelDeSeguran�a() +"\nEspecialidade: "
				+ this.getEspecialidade() +"\nCPF: "+ this.getCpf() + "\nTipo Sangu�neo: "+ this.getTipoSanguineo()
				+ "\nFator RH: " + this.getFatorRH() + "\nIdade: "+ this.getIdade() + "\n##############################################";
	}

}
