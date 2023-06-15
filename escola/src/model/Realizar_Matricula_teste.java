package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Realizar_Matricula_teste {

	@Test
	void test() {

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("felipe","BP3019047","Ads","41332042805","matriculado");
        a2.setIdade(2);
        
		assertEquals(2, a2.getIdade());
		//List<String> lista = new ArrayList<String>();
		//lista.add("elemento1");
		//lista.add("elemento2");

	
	    
	    Disciplina d1 = new Disciplina();
	    ArrayList<List> lista = d1.listarDisc();  
	    System.out.println(lista);
	    for(int i = 0;i<=lista.size();i++) {
		    Assert.assertEquals(4, lista.get(i).size());
	    	
	    }

	}

}
