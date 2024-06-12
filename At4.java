package Repetição3;

import java.util.Scanner;

public class At4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		double soma = 0, numero;
		for(int i = 0; i <= 9; i++) {
		System.out.println("informe um numero: ");
		
		numero=ler.nextDouble();
		soma = soma + numero;
		}
		System.out.println("O resultado é : " +soma);
	}
}
