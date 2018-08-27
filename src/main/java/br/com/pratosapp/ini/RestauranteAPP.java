package br.com.pratosapp.ini;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import br.com.pratosapp.actions.ManhaAction;
import br.com.pratosapp.actions.NoiteAction;
import br.com.pratosapp.actions.PeriodoAction;
import br.com.pratosapp.actions.RestauranteAction;

public class RestauranteAPP {
	
	public static void main(String[] args) {
		new RestauranteAction().iniciar();
	}

}
