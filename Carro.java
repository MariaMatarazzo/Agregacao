package RelacionamentroClasseAgregação;

public class Carro {
	private String modelo;
	private Motor motor;

	public Carro (String modelo) {
		this.modelo=modelo;
		this.motor=motor;
	}

	public void setModelo (String Modelo) {
		this.modelo= modelo ;
	}

	public String getModelo () {
		return modelo;

	}
}
