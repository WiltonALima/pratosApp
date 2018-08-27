package br.com.pratosapp.actions;

import java.util.Scanner;

public class RestauranteAction {
	public void iniciar() {
		System.out.println("Digite o periodo: ");
		String periodo = obterEntrada();
		if (periodo.toLowerCase().equals("manhã")) {
			String[] opcoes  = null;
			System.out.println("Digite as opções desejadas: ");
			String opcoesString = obterEntrada();
			opcoes = opcoesString.split(",");
			ManhaAction m = new ManhaAction(opcoes);
			selecionarPrato(m);
		}
		if (periodo.toLowerCase().equals("noite")) {
			String[] opcoes  = null;
			System.out.println("Digite as opções desejadas: ");
			String opcoesString = obterEntrada();
			opcoes = opcoesString.split(",");
			NoiteAction m = new NoiteAction(opcoes);
			selecionarPrato(m);
		}
	}
	public String obterEntrada() {
		Scanner scanner1 = getScanner();
		return scanner1.nextLine();
	}
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	private void selecionarPrato(PeriodoAction m) {
		String[] opcoes;
		String opcoesString;
		while (!m.valida()) {
			System.out.println(m.mostraOpcoesDisponiveis());
			System.out.println("Erro, comando invalido");
			System.out.println("Digite as opções desejadas: ");
			opcoesString = obterEntrada();
			opcoes = opcoesString.split(",");
			try {
				m = (PeriodoAction) m.getClass().getConstructors()[0].newInstance(opcoes);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(m.mostraRefeicao());
		System.out.println(m.valida());
		System.out.println(m.mostraOpcoesDisponiveis());
		System.out.println(m.mostraRefeicao());
	}
}
