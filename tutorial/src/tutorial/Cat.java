package tutorial;

public class Cat {

	public String name;
	public int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
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
}
