package RelacionamentroClasseAgregação;

public class Departamento {
	
	private static String nome;

	public Departamento (String nome) {
		this.nome = nome;
	}

	public void setNome (String nome) {
		this.nome= nome;
	}

	public static String getNome () {
		return nome;

	}
}



