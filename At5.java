package Repetição3;

import java.util.Scanner;

public class At5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double soma = 0, idade;
		for(int i = 0; i <= 19; i++) {
		System.out.println("informe a idade: ");
		
		idade=ler.nextDouble();
		soma = soma + idade;
		}
		System.out.println("O resultado é : " +soma);
	}

}
