package br.ufrn.imd.dao;

import br.ufrn.imd.modelo.*;

import java.util.ArrayList;

public class FuncionariosDAO {

	ArrayList<Funcionario> funcionarios = new ArrayList();
	
	public FuncionariosDAO()
	{
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public void adicionarFuncionario(Funcionario F) {
		this.funcionarios.add(F);
	}
	
	public String listarFuncionarios() {
		
		String S = "\n\n### Lista de Funcionarios ###\n";
		for (Funcionario f : funcionarios) {
			  S = f.toString();
			}
		
		return S;	
	}
	
	public static void main(String[] args) { 
		
		Tratador teste = new Tratador();
		
		FuncionariosDAO listaFuncionarios = new FuncionariosDAO();
				
		teste.setNivelDeSegurança(4526);
		teste.setNome("ayslan");
		teste.setCpf("04568563203");
		teste.setIdade(25);
		teste.setTipoSanguineo("A");
		teste.setFatorRH("+");
		teste.setEspecialidade("doguinhos");
		teste.setNivelDeSegurança(0);
		
		listaFuncionarios.adicionarFuncionario(teste);
		
		System.out.println(listaFuncionarios.listarFuncionarios());
		
	}
	
}
