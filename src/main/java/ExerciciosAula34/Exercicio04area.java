package ExerciciosAula34;


public class Exercicio04area {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea conversor = new ConversaoDeUnidadesDeArea();

        double metros = 5.0;
        double resultadoMetrosParaPes = conversor.metroQuadradoParaPeQuadrado(metros);
        System.out.println(metros + " metro quadrado é igual a " + resultadoMetrosParaPes + " pés quadrados.");

        int pes = 2;
        double resultadoPesParaCentimetros = conversor.peQuadradoParaCentimetrosQuadrados(pes);
        System.out.println(pes + " pé quadrado é igual a " + resultadoPesParaCentimetros + " centímetros quadrados.");

        double milhas = 3.0;
        double resultadoMilhasParaAcres = conversor.milhaQuadradaParaAcres(milhas);
        System.out.println(milhas + " milha quadrada é igual a " + resultadoMilhasParaAcres + " acres.");

        double acres = 4.0;
        double resultadoAcreParaPes = conversor.acreParaPesQuadrados(acres);
        System.out.println(acres + " acre é igual a " + resultadoAcreParaPes + " pés quadrados.");
    }
}