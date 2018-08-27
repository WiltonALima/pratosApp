package br.com.pratosapp.actions;
import static org.junit.Assert.*;
import org.junit.Test;

import br.com.pratosapp.model.PratosManha;

public class ManhaActionTest {
	@Test
	public void mostraOpcoesDisponiveis_test() {
		String[] opcoes = "1,2,3,3".split(",");
		ManhaAction manhaAction = new ManhaAction(opcoes);
		assertEquals((PratosManha.fromCodigo(opcoes[0]).getNome() + ", " + PratosManha.fromCodigo(opcoes[1]).getNome() + ", " + PratosManha.fromCodigo(opcoes[2]).getNome() + ", " + PratosManha.fromCodigo(opcoes[3]).getNome()), manhaAction.mostraRefeicao());
	}
}
