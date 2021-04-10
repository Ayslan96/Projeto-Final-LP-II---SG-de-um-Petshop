package br.ufrn.imd.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.ufrn.imd.modelo.Funcionario;
import br.ufrn.imd.modelo.Animal;


public class Petfera {
	
	
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Animal> animais;

	
	private static Petfera petfera;
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	private Petfera(){
		funcionarios        = new ArrayList<Funcionario>();
		animais        = new ArrayList<Animal>();
	}
	
	// Singleton
	public static Petfera getInstance() {
		if (petfera == null) {
			petfera = new Petfera();
		}
		return petfera;
	}
	
	public void inserirFuncionario(Funcionario f)  {
		funcionarios.add(f);
		System.out.println("Funcionario Inserido com sucesso!!");
	}
	
	public void inserirAnimal(Animal a)  {
		animais.add(a);
		System.out.println("Animal Inserido com sucesso!!");
	}

	public int buscaCodigoFuncionario() {
		int tamanho = funcionarios.size();
		return tamanho;
	}

	public String listarFuncionarios() {
		String S = "\n\n### Lista de Funcionarios ###\n";
		for (Funcionario f : funcionarios) {
				S += "Nome..: " + f.getNome() + "\n"+ 
						"cpf...: " + f.getCpf() + "\n";	
				S += "\n############################################\n\n";
			}	
		return S;	
	}
	
	public int buscaCodigoAnimal() {
		int tamanho = animais.size();
		return tamanho;
	}

	public String listarAnimais() {
		
		String S = "\n\n### Animais ###\n";
		
		for(Animal a: animais) {
			S += "Nome..: " + a.getNomeBatismo() + "\n";	
			S += "\n############################################\n\n";
		}
		
		return S;
	}

	
	
	
	

}
