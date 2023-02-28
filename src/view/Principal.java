package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		
		FatorialController fc = new FatorialController();
		int valor = 4;

		int fatorial = fc.fatorial(valor);
		System.out.println("Fatorial = " + fatorial);

	}

}