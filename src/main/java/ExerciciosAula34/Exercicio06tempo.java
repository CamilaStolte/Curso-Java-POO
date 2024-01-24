package ExerciciosAula34;

public class Exercicio06tempo {

	public static void main(String[] args) {
		
		ConversaoDeUnidadeTempo conversor = new ConversaoDeUnidadeTempo();

        double minuto = 5.0;
        double resultadominutoParaSegundos = conversor.minutoParaSegundos(minuto);
        System.out.println(minuto + "Minutos para segundos é igual a " + resultadominutoParaSegundos + "  segundos" );

        int hora = 2;
        double resultadohoraParaMinuto = conversor.horaParaMinuto(hora);
        System.out.println(hora + "Horas para minutos é igual: " + resultadohoraParaMinuto + " minutos" );

        double dia = 3.0;
        double resultadodiaParaHoras = conversor.diaParaHoras(dia);
        System.out.println(dia + "Dias para horas é igual a: " + resultadodiaParaHoras + " horas");

        double semana = 4.0;
        double resultadosemanaParaDias = conversor.semanaParaDias(semana);
        System.out.println(semana + "Semanas para dias é igual a:" + resultadosemanaParaDias + " dias");
        
        double mes = 6.0;
        double resultadomesParaDias = conversor.mesParaDias(mes);
        System.out.println(mes + "Meses para dias é igual a:" + resultadomesParaDias +" dias" );
        
        double ano = 7.0;
        double resultadoanoParaDias = conversor.anoParaDias(ano);
        System.out.println(ano + "Anos para dias é igual a:" + resultadoanoParaDias +" dias" );
    }
}