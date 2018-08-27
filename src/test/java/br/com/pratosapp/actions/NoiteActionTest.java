package br.com.pratosapp.actions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.pratosapp.model.PratosManha;
import br.com.pratosapp.model.PratosNoite;

public class NoiteActionTest {
	@Test
	public void mostraOpcoesDisponiveis_test() {
		String[] opcoes = "1,2,3,3,4".split(",");
		NoiteAction noiteAction = new NoiteAction(opcoes);
		assertEquals((PratosNoite.fromCodigo(opcoes[0]).getNome() + ", " + PratosNoite.fromCodigo(opcoes[1]).getNome() + ", " + PratosNoite.fromCodigo(opcoes[2]).getNome() + ", " + PratosNoite.fromCodigo(opcoes[3]).getNome()+ ", " + PratosNoite.fromCodigo(opcoes[4]).getNome()), noiteAction.mostraRefeicao());
	}
}
