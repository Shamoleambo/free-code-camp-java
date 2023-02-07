package tutorial;

public class Main {

	public static void main(String[] args) {
		Cat maninho = new Cat("maninho", 4);
		maninho.speak();

		Cat arrois = new Cat("arrois", 7);
		arrois.speak();

		Dog mano = new Dog("Mano", 1, true);
		mano.speak();

		Dog falus = new Dog("falus", 6, false);
		falus.speak();
	}
}
