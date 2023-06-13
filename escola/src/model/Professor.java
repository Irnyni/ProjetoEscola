package model;

public class Professor {

	 private String nomeProf;
	 private String areaEnsino;
	public String getNomeProf() {
		return nomeProf;
	}
	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}
	public String getAreaEnsino() {
		return areaEnsino;
	}
	public void setAreaEnsino(String areaEnsino) {
		this.areaEnsino = areaEnsino;
	}
	public Professor(String nomeProf, String areaEnsino) {
		super();
		this.nomeProf = nomeProf;
		this.areaEnsino = areaEnsino;
	}
	public Professor() {
		super();
	}
	@Override
	public String toString() {
		return "Professor [nomeProf=" + nomeProf + ", areaEnsino=" + areaEnsino + "]";
	}
	 
}
