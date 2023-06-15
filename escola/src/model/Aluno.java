package model;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class Aluno {
	
	private String nomeAluno;
	private String prontuario;
	private String curso;
	private String cpf;
	private String situacaoDisc;
	private int idade;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSituacaoDisc() {
		return situacaoDisc;
	}
	public void setSituacaoDisc(String situacaoDisc) {
		this.situacaoDisc = situacaoDisc;
	}
	public Aluno(String nomeAluno, String prontuario, String curso, String cpf, String situacaoDisc) {
		super();
		this.nomeAluno = nomeAluno;
		this.prontuario = prontuario;
		this.curso = curso;
		this.cpf = cpf;
		this.situacaoDisc = situacaoDisc;
	}
	public Aluno() {
		super();
	}
	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", prontuario=" + prontuario + ", curso=" + curso + ", cpf=" + cpf
				+ ", situacaoDisc=" + situacaoDisc + "]";
	}


	
	
}
