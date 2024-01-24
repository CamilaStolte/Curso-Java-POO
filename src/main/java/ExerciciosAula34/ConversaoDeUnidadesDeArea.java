package ExerciciosAula34;

public class ConversaoDeUnidadesDeArea {
	// pés quadrados	double metro = 10.76; 
	// centimetros quadradosint pe = 929;
	// acres double milha = 640;
	// pes quadrados double acre = 43.560; 
	
	double metroQuadradoParaPeQuadrado(double metros) {
        return metros * 10.76;
    }

    double peQuadradoParaCentimetrosQuadrados(int pes) {
        return pes * 929.0;
    }

    double milhaQuadradaParaAcres(double milhas) {
        return milhas * 640.0;
    }

    double acreParaPesQuadrados(double acres) {
        return acres * 43560.0;
    }
}

