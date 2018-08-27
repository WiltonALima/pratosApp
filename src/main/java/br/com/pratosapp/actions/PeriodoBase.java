package br.com.pratosapp.actions;

public abstract class PeriodoBase {
	private String[] opcoes;
	
	public PeriodoBase(String[] opcoes) {
		this.opcoes = opcoes;
	}
	public String[] getOpcoes() {
		return opcoes;
	}
	
}
