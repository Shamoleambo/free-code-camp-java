package tutorial;

public interface Vehicle {

	final int gears = 5;

	void changeGear(int g);

	void speedUp(int su);

	void slowDown(int sd);

	default void out() {
		System.out.println("Let's party");
	}
}
