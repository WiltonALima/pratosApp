package br.com.pratosapp.actions;

import br.com.pratosapp.exceptions.OpcaoInvalidaException;

public interface PeriodoAction {
	
	
	public String mostraRefeicao();
	
	public boolean valida();
	
	public String mostraOpcoesDisponiveis();
	
}
