package controller;

import model.Aluno;

public class ListaEspera_Controller {
	private int posicao;
	private String matricula;
	private String nomeDisc;
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNomeDisc() {
		return nomeDisc;
	}
	public void setNomeDisc(String nomeDisc)	 {
		this.nomeDisc = nomeDisc;
	}
	
  Aluno a= new Aluno();

}
