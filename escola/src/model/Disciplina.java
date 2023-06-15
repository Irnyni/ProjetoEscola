package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
	private String nomeDisc;
	private String sigla;
	private String descricao;
	private boolean statusDisc;
	public String getNomeDisc() {
		return nomeDisc;
	}
	
	
	public   ArrayList<List> listarDisc(){
		
	    ArrayList<List> listaDeDicionarios = new ArrayList<List>();
		

		List<String> lista = new ArrayList<String>();
		lista.add("Matematica");
		lista.add("PT");
		lista.add("Matemática básica");
		lista.add("true");
		List<String> lista1 = new ArrayList<String>();
		lista1.add("Portugues");
		lista1.add("PT");
		lista1.add("Português fundamental");
		lista1.add("true");
		List<String> lista2 = new ArrayList<String>();
		lista2.add("Ciencias");
		lista2.add("CIE");
		lista2.add("Ciencias bio");
	
		listaDeDicionarios.add(lista);
		listaDeDicionarios.add(lista1);
		listaDeDicionarios.add(lista2);
		
		return listaDeDicionarios;
		
		
		
		
	}
	
	
	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isStatusDisc() {
		return statusDisc;
	}
	public void setStatusDisc(boolean statusDisc) {
		this.statusDisc = statusDisc;
	}
	public Disciplina() {
		super();
	}
	@Override
	public String toString() {
		return "Disciplina [nomeDisc=" + nomeDisc + ", sigla=" + sigla + ", descricao=" + descricao + ", statusDisc="
				+ statusDisc + "]";
	}
	public Disciplina(String nomeDisc, String sigla, String descricao, boolean statusDisc) {
		super();
		this.nomeDisc = nomeDisc;
		this.sigla = sigla;
		this.descricao = descricao;
		this.statusDisc = statusDisc;
	}
	

}
