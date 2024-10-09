package RelacionamentroClasseAgregação;

public class SomativaAgregacao {
	
	private String Nome;
	private Departamento departamento; // Agregação
	
	public void Empresa (String nome, Departamento departamento) {
	this.Nome = nome;
	this.departamento = departamento;
}
	public Departamento getDepartamento () {
		return departamento;
}
		
	public void setDepartamento (Departamento Departamento) {
	this.departamento = Departamento;

}
}
