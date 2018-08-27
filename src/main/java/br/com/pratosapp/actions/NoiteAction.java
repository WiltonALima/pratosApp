package br.com.pratosapp.actions;

import br.com.pratosapp.model.PratosNoite;
import br.com.pratosapp.validators.NoiteValidator;

public class NoiteAction extends PeriodoBase implements PeriodoAction {
	
	public NoiteAction(String[] opcoes) {
		super(opcoes);
	}

	public String mostraRefeicao() {
		StringBuilder sbSaida = new StringBuilder("");
		for (String opcao : getOpcoes()) {
			boolean opcaoSelecionada = false;
			for (PratosNoite prato : PratosNoite.values()) {
				if (opcao.equals(prato.getCodigo())) {
					opcaoSelecionada = true;
				}
			}
			PratosNoite prato =  PratosNoite.fromCodigo(opcao);
			if (opcaoSelecionada) {
				if (sbSaida.length() == 0) {
					sbSaida.append(prato.getNome());
				} else {
					sbSaida.append(", " + prato.getNome());
				}
			}
		}
		return sbSaida.toString();
	}

	public boolean valida() {
		return new NoiteValidator().valida(getOpcoes());
	}

	public String mostraOpcoesDisponiveis() {
		StringBuilder sb = new StringBuilder();
		for ( PratosNoite  prato : PratosNoite.values()) {
			sb.append(" " + prato.getCodigo() + ":" + prato.getNome());
		}
		return sb.toString();
	}
}
