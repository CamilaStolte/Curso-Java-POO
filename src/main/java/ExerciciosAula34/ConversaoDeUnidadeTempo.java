package ExerciciosAula34;

public class ConversaoDeUnidadeTempo {
	
	double minutoParaSegundos(double minuto) {
        return minuto * 60;
	}
    double horaParaMinuto(int hora) {
        return hora * 60;
    }

    double diaParaHoras(double dia) {
        return dia * 24;
    }

    double semanaParaDias(double semana) {
        return semana * 7;
        
    }
    double mesParaDias(double mes) {
        return mes * 30;
    
    }
    double anoParaDias(double ano) {
        return ano * 365;
    }

}
