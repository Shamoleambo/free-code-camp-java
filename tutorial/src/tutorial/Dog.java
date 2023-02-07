package tutorial;

public class Dog extends Cat {

	private boolean big;

	public Dog(String name, int age, boolean big) {
		super(name, age);
		this.big = big;
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name) {
		super(name, 0);
	}

	public void speak() {
		if (this.big) {
			System.out.printf("I am a big dog, my name is %s and I am %d years old%n", this.name, this.age);
		} else {
			System.out.printf("I am a small dog, my name is %s and I am %d years old%n", this.name, this.age);
		}
	}

	public void bork() {
		if (this.big) {
			System.out.println("BORK!");
		} else {
			System.out.println("borrk");
		}
	}

}
