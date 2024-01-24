package ExerciciosAula36;

public class Professor {

	private String nome;
	private String email;
	private String departamento;
	
	public Professor(String nome, String email, String departamento) {
		this.nome = nome;
		this.email = email;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getDepartamento() {
		return departamento;
	}
}