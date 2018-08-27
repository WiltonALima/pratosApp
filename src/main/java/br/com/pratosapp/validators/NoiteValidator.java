package br.com.pratosapp.validators;

import br.com.pratosapp.model.PratosNoite;

public class NoiteValidator {
	public boolean valida(String[] opcoes) {
		for (String opcao : opcoes) {
			PratosNoite prato = PratosNoite.fromCodigo(opcao);
			if (prato == null) {
				return false;
			}
		}
		return true;
		
	}
}
