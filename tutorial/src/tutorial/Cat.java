package tutorial;

public class Cat {

	protected static int count = 0;

	public String name;
	public int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		Cat.count += 1;
	}

	public void speak() {
		System.out.printf("I am %s and I am %d years old%n", this.name, this.age);
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Cat: " + this.name;
	}
}
