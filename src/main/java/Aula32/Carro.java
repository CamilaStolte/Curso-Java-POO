package Aula32;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
		 
		this.marca =marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.consumoCombustivel = consumoCombustivel;
		
	
	}
	public Carro(String marca){
		marca = marca;
		
	}
}
