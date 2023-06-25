package model;

public class Participacao {
     private String matricula;
     private String nomeDisc;
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
		return "Participacao [matricula=" + matricula + ", nomeDisc=" + nomeDisc + "]";
	}
	public Participacao(String matricula, String nomeDisc) {
		super();
		this.matricula = matricula;
		this.nomeDisc = nomeDisc;
	}
	public Participacao() {
		super();
	}
     Aluno a = new Aluno();
     Turma y = new Turma();
}
