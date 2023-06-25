package controller;

import java.util.ArrayList;

import model.Disciplina;
import model.Turma;
import view.RealizarInscricao2;

public class Inscricao_Controller {
	
	
	
	
	public void apresentarDiscipina(ArrayList<Turma> listaTurma, ArrayList<Disciplina> lista) {
		
		
		RealizarInscricao2 frame = new RealizarInscricao2();
    	
        frame.enviaDados(listaTurma,lista);
	    frame.setVisible(true);

     
	}
	
	public Boolean concluirInscricao() {
		
		
		return true;
	}
	
	public void apresentarGrade() {
		
		
		
		
		
		
		

	}
	
	public void geraLIstaEspera() {
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	

}
