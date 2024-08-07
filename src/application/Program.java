package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Projeto feito para a aula do professor Rodrigo 

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Bem vindo a calculadora de funções");
		System.out.println();
		System.out.printf("Digite o valor da variável A: ");
		double A = sc.nextDouble();
		System.out.printf("Digite o valor da variável B: ");
		double B = sc.nextDouble();
		System.out.printf("Digite o valor da variável C: ");
		double C = sc.nextDouble();

		double Δ = Math.pow(B, 2) - 4 * A * C;
		double X1 = (-B + Math.sqrt(Δ)) / (2 * A);
		double X2 = (-B - Math.sqrt(Δ)) / (2 * A);

		System.out.println();

		System.out.println("Valor de Δ: " + Δ);

		System.out.println();

		if (Δ > 0) { // 1, -5, -6
			System.out.println("S = {" + X1 + ", " + X2 + "}");
			System.out.println("A função possui duas raízes reais distintas");
		} 
		else if (Δ == 0) { // 1, -12, 36
			System.out.println("S = {" + String.format("%.0f", X1) + "}");
			System.out.println("A função possui uma única raiz real");
		} 
		else if (Δ < 0) { // 2, 2, 1
			System.out.println("A função não possui raiz real");
		}

		sc.close();

	}

}
