package tutorial;

public class Car implements Vehicle {

	private int gear;
	private int speed;

	public Car() {
		this.gear = 0;
		this.speed = 0;
	}

	public void changeGear(int newGear) {
		if (newGear <= gears) {
			this.gear = newGear;
		}
	}

	public void speedUp(int speedUp) {
		this.speed += speedUp;
	}

	public void slowDown(int slowDown) {
		this.speed -= slowDown;
	}

	public void display() {
		System.out.printf("Gear: %d / Speed: %dKm/h%n", this.gear, this.speed);
		out();
	}
}
