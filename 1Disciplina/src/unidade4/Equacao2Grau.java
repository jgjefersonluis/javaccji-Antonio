package unidade4;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		int a, b, c;
		double delta, x1, x2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		a = teclado.nextInt();
		
		System.out.println("Digite o valor de B");
		b = teclado.nextInt();
		
		System.out.println("Digite o valor de C");
		c = teclado.nextInt();
		
		delta = b*b - 4*a*c;
		
		if(delta >= 0) // existem raizes reais
		{ // inicio
			x1 = -b - (Math.sqrt(delta))/2*a;
			x2 = -b + (Math.sqrt(delta))/2*a;
			System.out.println("O valor de x1 = " + x1);
			System.out.println("O valor de x2" + x2);
			
			
		} // fim
		

	}

}
