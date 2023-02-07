package tutorial;

public class Main {

	public static void main(String[] args) {
		Cat maninho = new Cat("maninho", 4);
		maninho.speak();

		Cat arrois = new Cat("arrois", 7);
		arrois.speak();

		System.out.println(maninho.getAge());
		maninho.setAge(5);
		System.out.println(maninho.getAge());
	}
}
