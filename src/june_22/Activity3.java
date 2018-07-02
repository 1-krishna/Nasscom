package june_22;

class Car{
	private double speed;
	private String color;
	
	void carInfo(){
		System.out.println("Color : " + this.color + " Speed : " + this.speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}


class Maruti extends Car{
	Engine eng = new Engine();
	
	public Maruti(String color, double speed){
		this.setColor(color);
		this.setSpeed(speed);
	}
	
	public void engineInfo(){
		eng.start();
		eng.stop();
	}
}

class Engine{
	public void start(){
		System.out.println("Engine Started");
	}
	
	public void stop(){
		System.out.println("Engine Stopped");
	}
}


public class Activity3 {

	public static void main(String[] args) {
		
		Maruti maruti = new Maruti("Black", 60);
		
		maruti.carInfo();
		
		maruti.engineInfo();
		
	}

}
