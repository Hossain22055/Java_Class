
public class Classes {

	public static void main(String[] args) {
		Car car =new Car();
		car.setDoors("The doors are closed");
		System.out.println(car.getDoors());
		
		car.setDoors("closed");
		car.setDriver("seated");
		car.setSpeed(12);
		car.setEngine("on");
		System.out.println(car.run());
		
		
	}

}
