package br.com.pratosapp.actions;

import br.com.pratosapp.model.PratosManha;
import br.com.pratosapp.validators.ManhaValidator;

public class ManhaAction extends PeriodoBase implements PeriodoAction {
	
	
	public ManhaAction(String[] opcoes) {
		super(opcoes);
	}

	public String mostraRefeicao() {
		StringBuilder sbSaida = new StringBuilder("");
		for ( String opcao : getOpcoes()) {
			boolean opcaoSelecionada = false;
			for (PratosManha prato : PratosManha.values()) {
				if (opcao.equals(prato.getCodigo())) {
					opcaoSelecionada = true;
				}
			}
			PratosManha prato = PratosManha.fromCodigo(opcao);
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
		return new ManhaValidator().valida(getOpcoes());
	}

	public String mostraOpcoesDisponiveis() {
		StringBuilder sb = new StringBuilder();
		for ( PratosManha  prato : PratosManha.values()) {
			sb.append(" " + prato.getCodigo() + ":" + prato.getNome());
		}
		return sb.toString();
	}
}
