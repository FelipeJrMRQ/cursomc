package com.felipe.cursomc.servvices.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<Ator> lista = new ArrayList<>();
		
		Ator a1 = new Ator("Felipe","São Paulo");
		Ator a2 = new Ator("Jose","São Paulo");
		Ator a3 = new Ator("Carlos","São Paulo");
		Ator a4 = new Ator("Antonio","São Paulo");
		Ator a5 = new Ator("Pedro","São Paulo");

		lista.addAll(Arrays.asList(a1,a2,a3,a4,a5));
		
		long inicio = Calendar.getInstance().getTimeInMillis();
		for(Ator a : lista) {
			System.out.println(a);
		}
		long fim = Calendar.getInstance().getTimeInMillis();
		
		
		
		lista.forEach(n-> System.out.println(n.getNome()));
		
	}
}
