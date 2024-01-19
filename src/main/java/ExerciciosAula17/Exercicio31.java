package ExerciciosAula17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in).useLocale(Locale.US);		
	    boolean sair = false;
	    double totalCompra = 0;
	    
	    System.out.println("Lojas Tabajara");
	    
	    while (!sair) {
		    System.out.println("Informe o valor do produto: ");
		    double valorProduto =scan.nextDouble();

	    	if (valorProduto == 0) {
	    		sair = true;
	    	} else {
	    		totalCompra += valorProduto;
	    	}
	    }
	    
	    System.out.println("Total da compra: R$" + totalCompra);

        if (totalCompra > 0) {
            System.out.println("Informe o valor em dinheiro que será pago: ");
            double valorPago = scan.nextDouble();

            double troco = valorPago - totalCompra;

            if (troco >= 0) {
                System.out.println("Troco: R$ " + troco);
            } else {
                System.out.println("Valor insuficiente. Faltam R$ " + Math.abs(troco));
            }
        }
    }
}

		
		//recer número de valores de mercadorias
		
		//0indica final da compra
		
		// mostrar total da compra
		//perguntar o valor em dinheiro que vai ser pago
		
		//calcular e mostrar o troco
		// voltar ao ponto inicial para registrar a compra
		

