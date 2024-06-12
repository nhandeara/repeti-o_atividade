package Repetição3;

import java.util.Scanner;

public class At3while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int i=0;
		
		while(i <=9) {
			i++;
			System.out.println("informe o nome: ");
			nome=ler.next();
		}
        ler.close();
	}

}
