package model;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Disciplina;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Turma {
	
	private String nomeProf;
	private int semestre;
	private int ano;
	private int qtdeAlunos;
	private String localAula;
	private String horarioAula;
	
	Disciplina d = new Disciplina();
	public   List<String> listarTurmas(){
		
	
		
   
		List<String> listaResumo = new ArrayList<String>();
		listaResumo.add("Biologia 1º semestre diurno");
		listaResumo.add("Matemática 1º semestre diurno");
		listaResumo.add("Portugues 2º semestre noturno");
		listaResumo.add("Filosofia 1º semestre diurno");
		listaResumo.add("Biologia 2º semestre noturno");
		

		return listaResumo;
		
		
		
		
	}
	
	public ArrayList<Turma> getListaR() {
		
	    Turma T1 = new Turma("Juliano", 2, 2022, 25, "SALA 5", "DIURNO");
	    Turma T2 = new Turma("Maria", 1, 2022, 25, "SALA 7", "NOTURNO");
	    Turma T3 = new Turma("João", 1, 2022, 22, "SALA 3", "DIURNO");
	    Turma T4 = new Turma("Ana", 1, 2022, 22, "SALA 2", "NOTURNO");
        ArrayList<Turma> listaTurmas = new ArrayList<Turma>();
        listaTurmas.addAll(Arrays.asList(T1, T2, T3, T4));
		
		return listaTurmas;
	}
	public ArrayList<Turma> getListaB() {
		
        Turma T1 = new Turma("Juliano", 2, 2022, 24, "SALA 5", "DIURNO");
        Turma T2 = new Turma("Maria", 1, 2022, 23, "SALA 7", "NOTURNO");
        Turma T3 = new Turma("João", 1, 2022, 22, "SALA 3", "DIURNO");
        Turma T4 = new Turma("Ana", 1, 2022, 22, "SALA 2", "NOTURNO");
        ArrayList<Turma> listaTurmas = new ArrayList<Turma>();
        listaTurmas.addAll(Arrays.asList(T1, T2, T3, T4));
		
		return listaTurmas;
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
	public Turma(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Turma(String string, int i, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Turma [nomeProf=" + nomeProf + ", semestre=" + semestre + ", ano=" + ano + ", qtdeAlunos=" + qtdeAlunos
				+ ", localAula=" + localAula + ", horarioAula=" + horarioAula + "]";
	}
	



}
