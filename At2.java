package Repetição3;

import java.util.Scanner;

public class At2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double soma = 0;
		for(int i = 0; i <= 15; i++) {
		soma = soma +(i);
		}
		System.out.println("O resultado é : " +soma);
	}
}