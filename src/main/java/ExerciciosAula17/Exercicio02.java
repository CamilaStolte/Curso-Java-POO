package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        boolean infoValida = false;
        String senha;
        String usuario;
        do {
        	
	        System.out.println("Digite o nome de usúario: ");
	        usuario = scan.nextLine();
	        
	        System.out.println("Digite a senha: ");
	        senha = scan.nextLine();
	          
	        if (usuario.equalsIgnoreCase(senha)) {
	        	infoValida = false;
	        	System.out.println("Senha igual ao usúario, digite novamente.");
	        } else {
	        	infoValida = true;
	        	System.out.println("Senha e usuários válidos");
	        	
	        }
	        
	        	
	        } while (!infoValida);
     

	}

}
