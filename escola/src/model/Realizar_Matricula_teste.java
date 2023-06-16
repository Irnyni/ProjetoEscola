package model;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Realizar_Matricula_teste {

	@Test
	void test() {

		
		// TESTE NAS CLASSES ENVOLVIDAS 
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("felipe","BP3019047","Ads","41332042805","matriculado");
        a2.setIdade(2);
        

        // TESTE DE APRESENTAÇÃO DAS DISCIPLINAS , ACESSANDO O METODO DA CLASSE DISCIPLINA 
        
	    Disciplina d1 = new Disciplina("Matemática","MT","Matemática básica",true);
	    Disciplina d2 = new Disciplina("Portugues","pt", "Portugues básico",true);
	    Disciplina d3 = new Disciplina("Biologia","BIO", "Biologia médio",true);
	    Disciplina d4 = new Disciplina("Filosofia","FIL", "Filosofia Médio",true);
	    ArrayList<Disciplina> lista = new  ArrayList<Disciplina>();

	    lista.addAll(Arrays.asList(d1, d2, d3, d4));


	    int tamanhoLista = lista.size();
	    Assert.assertEquals(4, tamanhoLista);

	    
        //TESTAR A QUANTIDADE DE ATRIBUTOS VINDAS DE UM OBJETO DA CLASSE DISCIPLINA
        
        for (Disciplina disciplina : lista) {
            Field[] campos = disciplina.getClass().getDeclaredFields();
            int quantidadeAtributos = campos.length;
            Assert.assertEquals(4, quantidadeAtributos);
        }
	    
	    //Teste para verificar a ordem das disciplinas na lista 
	    
	    Assert.assertEquals(d1, lista.get(0));
	    Assert.assertEquals(d2, lista.get(1));
	    Assert.assertEquals(d3, lista.get(2));
	    Assert.assertEquals(d4, lista.get(3));

	    //TESTE PARA VERIFICAR SE A LISTA NÃO CONTÉM UMA DISCIPLINA ESPECÍFICA
        Assert.assertTrue(lista.contains(d1));

        System.out.println(lista);
	    
        // TESTE DE APRESENTAÇÃO DAS Turmas ,  ACESSANDO O METODO DA CLASSE TURMA
 
        Turma T1 = new Turma("Juliano",2, 2022, 25, "SALA 5", "DIURNO");
        Turma T2 = new Turma("Maria",1, 2022, 30, "SALA 7", "NOTURNO");
        Turma T3 = new Turma("João",1, 2022, 28, "SALA 3", "DIURNO");
        Turma T4 = new Turma("Ana",1, 2022, 22, "SALA 2", "NOTURNO");
        ArrayList<Turma> listaTurmas = new  ArrayList<Turma>();
        listaTurmas.addAll(Arrays.asList(T1, T2, T3, T4));

        //TESTAR A QUANTIDADE DE ATRIBUTOS VINDAS DE UM OBJETO DA CLASSE TURMA
        
        for (Turma turma : listaTurmas) {
            Field[] campos = turma.getClass().getDeclaredFields();
            int quantidadeAtributos = campos.length;
            Assert.assertEquals(6, quantidadeAtributos);
        }
        
        
	    System.out.println(listaTurmas);
	    
	    
	    
	}

}
