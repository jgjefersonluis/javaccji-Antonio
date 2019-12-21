package unidade4;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numero = scn.nextInt();
		if (numero % 2 == 0)
			System.out.println("Este número é Par!");

	}

}
