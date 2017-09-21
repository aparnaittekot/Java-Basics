package otherexamples;

class Vehicle {
	public void move() {
		System.out.println("Vehicles are used for moving from one place to another ");
	}
}

class Car extends Vehicle {
	public void move() {
		super.move();
		System.out.println("Car is a good medium of transport ");
	}
}

public class SuperKeywordExample {
	public static void main(String args[]) {
		Vehicle b = new Car();
		b.move();
	}
}