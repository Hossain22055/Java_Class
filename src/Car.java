
public class Car {

	
	private String doors; 
	private String engine;
	private String driver;
	private int speed;
	
	
	
	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	
	public void setSpeed(int speed) {
		this.speed= speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String run() {
		if (doors.equals("closed") && engine.equals("on")
				&& driver.equals("seated") && speed>0) {
			return "The Car is running";
		}else {
			return "The Car is not running";
		}
	}

}
