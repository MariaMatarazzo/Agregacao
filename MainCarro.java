package RelacionamentroClasseAgregação;

public class MainCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor motor = new Motor ("V8") ;
		Carro carro = new Carro ("Mustang") ;
		System. out.println ("Carro é: " + carro.getModelo () + "\nMotor:"  + motor.getTipo ()) ;
	}
}