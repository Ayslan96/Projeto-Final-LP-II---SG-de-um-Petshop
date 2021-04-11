package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.modelo.*;

public class AnimaisDAO {
	
	ArrayList<Animal> animais = new ArrayList<Animal>();
	
	public AnimaisDAO()
	{
		 animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal A)
	{
		animais.add(A);
	}
	
	public String listarAnimais()
	{
		String S = "\n\n### Animais ###\n";
		
		for(Animal a: animais) {
			S = a.toString();
		}
		
		return S;
	}
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimaisDAO listaAnimais = new AnimaisDAO();
		
		AnfibioExotico a1 = new AnfibioExotico();
		AveExotico a2 = new AveExotico();
		
		a1.setId(12);
		a1.setNomeBatismo("Frederico");
		a2.setNomeBatismo("José");
		
		listaAnimais.adicionarAnimal(a1);
		listaAnimais.adicionarAnimal(a2);
		
		System.out.println(listaAnimais.listarAnimais());

	}

}
