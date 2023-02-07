package tutorial;

public class Main {

	public static void main(String[] args) {
		Car carro = new Car();
		
		carro.changeGear(5);
		carro.speedUp(85);
		carro.slowDown(15);
		carro.display();
	}
}
