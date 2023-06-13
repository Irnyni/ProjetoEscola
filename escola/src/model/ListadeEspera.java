package model;

public class ListadeEspera {
	
	private int posicaoAluno;
	private String matricula;
	private String nomeDisc;
	public int getPosicaoAluno() {
		return posicaoAluno;
	}
	public void setPosicaoAluno(int posicaoAluno) {
		this.posicaoAluno = posicaoAluno;
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
	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}
	@Override
	public String toString() {
		return "ListadeEspera [posicaoAluno=" + posicaoAluno + ", matricula=" + matricula + ", nomeDisc=" + nomeDisc
				+ "]";
	}
	public ListadeEspera(int posicaoAluno, String matricula, String nomeDisc) {
		super();
		this.posicaoAluno = posicaoAluno;
		this.matricula = matricula;
		this.nomeDisc = nomeDisc;
	}
	public ListadeEspera() {
		super();
	}
	 

}
