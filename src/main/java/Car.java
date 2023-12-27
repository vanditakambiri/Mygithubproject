
public class Car {
	
	String brand;
	String model;
	int year;
	
	public Car (String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
public String getCarInfo() {
	return year + " " + brand + " " + model;
	}
public void updateYear(int newYear) {
	year = newYear;
}

public static void main (String[] args) {
	Car car1 = new Car("Toyota", "Corolla", 2020);
	Car car2 = new Car("Tesla", "Model s", 2022);
	
	System.out.println("Car1: " + car1.getCarInfo());
	System.out.println("Car2: " + car2.getCarInfo());
	
    car1.updateYear(2021);
    System.out.println("Car 1's updated year: " + car1.getCarInfo());
    }
}