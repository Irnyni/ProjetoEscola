package controller;

import model.Aluno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno();
		
		a1.setNome("felipe");
	    
		
		System.out.println( a1.toString());
		
		Aluno a2 = new Aluno("joao",25,"BP3019047");
		System.out.println(a2.toString());
	}

}
