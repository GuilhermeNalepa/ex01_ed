package controller;

public class FatorialController {
	
	public FatorialController() {
		
		super();
		
	}
	
	public int fatorial(int valor) {
		
		//Condição de parada
		if (valor == 0) {
			
			return 1;
			//Quando o valor tiver sido subtraído o suficiente para o fatorial,
			//retornará 1
			
		} else {
			
			return valor * fatorial(valor - 1);
			//Retorno é feito multiplicando o valor pela chamada da função
			//com o valor substraído por um
			
		}
		
	}
	
}