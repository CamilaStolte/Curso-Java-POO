package ExerciciosAula34;

public class Exercicio05Conversao {
	public static void main(String[] args) {
		ConversaoDeUnidadesDeVolume conversor = new ConversaoDeUnidadesDeVolume();

        double litro = 5.0;
        double resultadoLitrosParaCmCubicos = conversor.litrosParaCentimetrosCubicos(litro);
        System.out.println(litro + " Litros para Centímetros cúbicos é igual a " + resultadoLitrosParaCmCubicos + " Centímetros cúbicos" );

        int metrosCubico = 2;
        double resultadometroCubicoParaLitros = conversor.metroCubicoParaLitros(metrosCubico);
        System.out.println(metrosCubico + " Metros cúbicos para litros é igual: " + resultadometroCubicoParaLitros + " litros" );

        double metrosCubicos = 3.0;
        double resultadometroCubicoParaPesCubicos = conversor.metroCubicoParaPesCubicos(metrosCubicos);
        System.out.println(metrosCubicos + " Metros cúbicos para pés cúbicos é igual a: " + resultadometroCubicoParaPesCubicos + " pés cúbicos");

        double galaoAmerico = 4.0;
        double resultadogalaoAmericoParaPolegadasCubicas = conversor.galaoAmericoParaPolegadasCubicas(galaoAmerico);
        System.out.println(galaoAmerico + "Galão americano para Litros é igual a:" + resultadogalaoAmericoParaPolegadasCubicas + " Litros");
   
        
        double galaoAmericoLitro = 4.0;
        double resultadogalaoAmericoParaLitros = conversor.galaoAmericoParaLitros(galaoAmericoLitro);
        System.out.println(galaoAmericoLitro + "Galão americano para Litros é igual a:" + resultadogalaoAmericoParaLitros +" Litros" );
    }
}