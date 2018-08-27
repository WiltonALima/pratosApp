package br.com.pratosapp.validators;

import br.com.pratosapp.actions.ManhaAction;
import br.com.pratosapp.model.PratosManha;

public class ManhaValidator {
	
	public boolean valida(String[] opcoes) {
		for (String opcao : opcoes) {
			PratosManha prato = PratosManha.fromCodigo(opcao);
			if (prato == null) {
				return false;
			}
		}
		return true;
		
	}
}
