package factorypattern;

import java.util.HashMap;
import java.util.Map;

interface Building {

	void display();
}

class BLR01 implements Building {

	public void display() {
		System.out.println("Inside BLR01 class");
	}

}

class BLR05 implements Building {

	public void display() {
		System.out.println("Inside BLR05 class");
	}
}

class BLR03 implements Building {

	public void display() {
		System.out.println("Inside BLR03 class");
	}
}

class BuildingFactory {
	private static Map<String, Building> objects = new HashMap<>();

	static {
		objects.put("BLR01", new BLR01());
		objects.put("BLR05", new BLR05());
		objects.put("BLR03", new BLR03());
	}

	public static Building getBuilding(String name) {
		return objects.get(name);
	}
}

public class FactoryPattern {
	public static void main(String[] args) {

		// Pick the object
		Building p = BuildingFactory.getBuilding("BLR01");
		p.display();

		Building p1 = BuildingFactory.getBuilding("BLR05");
		p1.display();
	}
}
