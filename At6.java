package Repetição3;

import java.util.Scanner;

public class At6 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		 double idade,soma=0,media,i=0;
				
		   while (i<=19) {
			i++;
			System.out.println ("informe um numero: ");
		    idade=ler.nextDouble();
			soma = soma+idade;
			
		     media=soma/19;
		     System.out.println("a soma é:" + soma + "e a media é:" + media);
		   }
		     ler.close();

	}

}
