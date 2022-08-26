package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.retangulo;


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangulo retang = new retangulo();
		
		//FUNCAO PARA CHAMAR A ALTURA
		
		System.out.println("INFORME Á ALTURA:");
		retang.altura = sc.nextDouble();
		
		//FUNCAO PARA CHAMAR A LARGULA
		System.out.println("INFORME Á LARGULA:");
		retang.largura = sc.nextDouble();
	
		System.out.printf("area é: %.2f",retang.area());
		System.out.printf("\nperimento e: %.2f ",retang.perimetroRet());
		System.out.printf("\ndiagonal e: %.2f",retang.diagonalRet());
		
		sc.close();
	
	
	}

}
