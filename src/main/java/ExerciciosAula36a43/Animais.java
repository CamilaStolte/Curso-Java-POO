package ExerciciosAula36a43;

public class Animais {
	private String nomeAnimal;
	private double comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animais(String nomeAnimal, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        this.nomeAnimal = nomeAnimal;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
       
    }

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public double getComprimento() {
		return comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public String getCor() {
		return cor;
	}

	public String getAmbiente() {
		return ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	
	}
		@Override
	    public String toString() {
	        return "Nome: " + nomeAnimal + "\nComprimento: " + comprimento + " cm\nNúmero de Patas: " + numPatas +
	                "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade + " m/s";
	    }
	}