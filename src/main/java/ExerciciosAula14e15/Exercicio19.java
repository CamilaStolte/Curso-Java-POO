package ExerciciosAula14e15;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor = scan.nextInt();
		int cen = 0;
		int dez = 0;		
		int uni = 0;
		int resto = 0;
		
		if(valor > 0 && valor < 1000) {
			
			if(valor % 100 == 0) {
				cen = valor/100;
			} else {				
				cen = valor/100;
				resto = valor%100;
				dez = resto / 10;
				
				if(dez % 10 != 0) {
					uni = resto%10;
				}
			}					
		}else {
			
			System.out.println("O valor é Invalido.");
		}
		
		if(cen == 1) {
			
			if(dez == 1) {
				
				if(uni == 1) {
					
					System.out.println(valor + " = " + cen + " centena, " + dez + " dezena, " + uni + " unidade");
				} else {
					
					System.out.println(valor + " = " + cen + " centena, " + dez + " dezena, " + uni + " unidades");
				}				
			} else {
				
				if(uni == 1) {
					
					System.out.println(valor + " = " + cen + " centena, " + dez + " dezenas, " + uni + " unidade");
				} else {
					
					System.out.println(valor + " = " + cen + " centena, " + dez + " dezenas, " + uni + " unidades");
				}	
				
			}
		} else {
			if(dez == 1) {
				
				if(uni == 1) {
					
					System.out.println(valor + " = " + cen + " centenas, " + dez + " dezena, " + uni + " unidade");
				} else {
					
					System.out.println(valor + " = " + cen + " centenas, " + dez + " dezena, " + uni + " unidades");
				}				
			} else {
				
				if(uni == 1) {
					
					System.out.println(valor + " = " + cen + " centenas, " + dez + " dezenas, " + uni + " unidade");
				} else {
					
					System.out.println(valor + " = " + cen + " centenas, " + dez + " dezenas, " + uni + " unidades");
				}	
				
			}
		}
		
	}
}