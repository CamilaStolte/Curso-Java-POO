package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que você ganha por hora trabalhada: ");
        double valorPorHora = scan.nextDouble();
        
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double quantidadeHoras = scan.nextDouble();
        
        double salarioBruto = valorPorHora * quantidadeHoras;
        double descSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double descInss = salarioBruto * 0.10;
        double descIr5 = salarioBruto * 0.05;
        double descIr10 = salarioBruto * 0.10;
        double descIr20 = salarioBruto * 0.20;


        
        if (salarioBruto <= 900) {
        	System.out.println("O valor do seu salário bruto é: R$" + salarioBruto);
        	System.out.println("Você está isento do IR.");
        	System.out.println("Desconto INSS: R$" + descInss);
        	System.out.println("Desconto Sindicato: R$" + descSindicato);
        	System.out.println("Valor de depósito FGTS: R$" + fgts);
        	System.out.println("Total de descontos: R$" + (descInss + descSindicato));
        	System.out.println("Salário Liquido: R$" +  (salarioBruto -descInss - descSindicato));
       
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
        	System.out.println("O valor do seu salário bruto é: R$" + salarioBruto);
        	System.out.println("Desconto IR: " + (salarioBruto * 0.05));
        	System.out.println("Desconto INSS: R$" + descInss);
        	System.out.println("Desconto Sindicato: R$" + descSindicato);
        	System.out.println("Valor de depósito FGTS: R$" + fgts);
        	System.out.println("Total de descontos: R$" + (descInss + descSindicato + descIr5));
        	System.out.println("Salário Liquido: R$" +  (salarioBruto -descInss - descSindicato - descIr5));

        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
        	System.out.println("O valor do seu salário bruto é: R$" + salarioBruto);
        	System.out.println("Desconto IR: " + (salarioBruto * 0.10));
        	System.out.println("Desconto INSS: R$" + descInss);
        	System.out.println("Desconto Sindicato: R$" + descSindicato);
        	System.out.println("Valor de depósito FGTS: R$" + fgts);
        	System.out.println("Total de descontos: R$" + (descInss + descSindicato + descIr10));
        	System.out.println("Salário Liquido: R$" +  (salarioBruto -descInss - descSindicato - descIr10));
   
        } else if (salarioBruto > 2500) {
        	System.out.println("O valor do seu salário bruto é: R$" + salarioBruto);
        	System.out.println("Desconto IR: " + (salarioBruto /100 * 20));
        	System.out.println("Desconto INSS: R$" + descInss);
        	System.out.println("Desconto Sindicato: R$" + descSindicato);
        	System.out.println("Valor de depósito FGTS: R$" + fgts);
        	System.out.println("Total de descontos: R$" + (descInss + descSindicato + descIr20));
        	System.out.println("Salário Liquido: R$" +  (salarioBruto - descInss - descSindicato - descIr20));

        } else {
        	System.out.println("Favor inserir um valor válido");
        }

	}

}
