package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
	private String nomeDisc;
	private String sigla;
	private String descricao;
	private boolean statusDisc;
	ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
	public String getNomeDisc() {
		return nomeDisc;
	}
	

	public   ArrayList<Disciplina> listarDisc(Disciplina d3){
		
          Disciplina d1 = new Disciplina("Matemática", "MT", "Matemática básica", true);
//        Disciplina d2 = new Disciplina("Portugues", "pt", "Portugues básico", true);
//        Disciplina d3 = new Disciplina("Biologia", "BIO", "Biologia médio", true);
//        Disciplina d4 = new Disciplina("Filosofia", "FIL", "Filosofia Médio", true);

        lista.addAll(Arrays.asList(d3));
        System.out.println(lista);
        
		return lista;
		
		
		
		
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
