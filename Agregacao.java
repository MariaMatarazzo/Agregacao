package RelacionamentroClasseAgregação;

public class Agregacao {
	
	private String modelo;
	private Motor motor; // Agregação
	
	public void Carro (String modelo, Motor motor) {
	this.modelo = modelo;
	this.motor = motor;
}
	public String getModelo () {
		return modelo;
}
		
	public void setModelo (String modelo) {
	this.modelo = modelo;
}

}