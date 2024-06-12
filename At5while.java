package Repetição3;

import java.util.Scanner;

public class At5while {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int soma=0, i=0;
		double idade;
		{
	       
	       while(i<=19) {
	       System.out.println("informe a idade: ");
	      idade=ler.nextDouble();
	       soma+=idade;
	       i++;
	       }
	     System.out.println("o resultado da soma é:" + soma);

	}
	ler.close();
	}
}


