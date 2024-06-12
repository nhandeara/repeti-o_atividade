package Repetição3;
import java.util.Scanner;
public class At4while {

	public static void main(String[] args) {
		
	}
		Scanner ler = new Scanner (System.in);
		int soma=0, i=0;
		double numero;
		{
	       
	       while(i<=9) {
	       System.out.println("informe um numero: ");
	       numero=ler.nextDouble();
	       soma+=numero;
	       i++;
	       }
	     System.out.println("o resultado da soma é:" + soma);
}
}
