package Aula06;

public class Argumentos {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Você digitou: " + args[0]);
        } else {
            System.out.println("Nenhum argumento fornecido.");
        }
    }
}
