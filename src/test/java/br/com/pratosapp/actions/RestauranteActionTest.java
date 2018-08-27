package br.com.pratosapp.actions;

import java.util.Scanner;

import org.junit.Test;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;


public class RestauranteActionTest{
	static int contador = 0;
	@Test
	public void iniciar_test() throws Exception {
		RestauranteAction action = new RestauranteAction() {
			public String obterEntrada() {
				contador++;
				if (contador == 1) {
					return "manhã";
				} else {
					return "1,2,3";
				}
			}
		};
		action.iniciar();
		if (contador != 2) {
			throw new Exception("A entrada foi chamada mais de 2 vezes");
		}
	}

	
}
