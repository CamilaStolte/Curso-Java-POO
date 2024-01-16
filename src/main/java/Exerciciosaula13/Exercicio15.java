package Exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        System.out.println("Digite o valor você ganha por hora trabalhada: ");
        double horaTrablalhada = scan.nextDouble();
        
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double quantidadeHoras = scan.nextDouble(); 
        
        double salarioSemDesconto = horaTrablalhada * quantidadeHoras;
        double descontoIR = (salarioSemDesconto / 100) * 11;
        double descontoInss = (salarioSemDesconto / 100) * 8;
        double descontoSindicato = (salarioSemDesconto / 100) * 5;
        double descontos = descontoIR + descontoInss + descontoSindicato;
        double salarioLiquido =  salarioSemDesconto - descontos;
        
        		
        		
        System.out.println("O valor total do seu salário no referido mês é: R$" + salarioSemDesconto);
        System.out.println("O valor pago a INSS é: R$" + descontoInss);
        System.out.println("O valor pago ao Sindicato é: R$" + descontoSindicato);
        System.out.println("O valor do seu salário líquido no referido mês é: R$" + salarioLiquido);


	}

}
