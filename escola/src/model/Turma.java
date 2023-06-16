package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private String nomeProf;
	private int semestre;
	private int ano;
	private int qtdeAlunos;
	private String localAula;
	private String horarioAula;
	
	public   ArrayList<List> listarTurmas(){
		
	    ArrayList<List> listaDeTurmas = new ArrayList<List>();
		

		List<String> lista = new ArrayList<String>();
		lista.add("Juliano");
		lista.add("6");
		lista.add("2022");
		lista.add("25");
		lista.add("sala 5");
		lista.add("Diurno");
		
		listaDeTurmas.add(lista);
		return listaDeTurmas;
		
		
		
		
	}
	
	
	public String getNomeProf() {
		return nomeProf;
	}
	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getQtdeAlunos() {
		return qtdeAlunos;
	}
	public void setQtdeAlunos(int qtdeAlunos) {
		this.qtdeAlunos = qtdeAlunos;
	}
	public String getLocalAula() {
		return localAula;
	}
	public void setLocalAula(String localAula) {
		this.localAula = localAula;
	}
	public String getHorarioAula() {
		return horarioAula;
	}
	public void setHorarioAula(String horarioAula) {
		this.horarioAula = horarioAula;
	}
	public Turma() {
		super();
	}
	public Turma(String nomeProf, int semestre, int ano, int qtdeAlunos, String localAula, String horarioAula) {
		super();
		this.nomeProf = nomeProf;
		this.semestre = semestre;
		this.ano = ano;
		this.qtdeAlunos = qtdeAlunos;
		this.localAula = localAula;
		this.horarioAula = horarioAula;
	}
	@Override
	public String toString() {
		return "Turma [nomeProf=" + nomeProf + ", semestre=" + semestre + ", ano=" + ano + ", qtdeAlunos=" + qtdeAlunos
				+ ", localAula=" + localAula + ", horarioAula=" + horarioAula + "]";
	}
	
	

}
