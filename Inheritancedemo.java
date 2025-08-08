package inheritancedemo;
class Vehicle{
	String brand;
	String model;

Vehicle(String brand,String model){
	this.brand=brand;
	this.model=model;
	
}

public void displayinfo() {
	System.out.println("brand:\t"+brand);
	System.out.println("model:\t"+model);
	
	
}
}
class Car extends Vehicle{
	String fueltype;
	Car(String brand,String model,String fueltype){
	super(brand,model);
	this.fueltype=fueltype;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("fueltype:"+fueltype);
	}
}
class Electriccar extends Car{
	double batterycapacity;
	Electriccar(String brand,String model,String fueltype,double battercapacity){
		super(brand,model,fueltype);
		this.batterycapacity=batterycapacity;
	}
		
		public void displayinfo() {
			super.displayinfo();
			System.out.println("batterycapacity:"+batterycapacity);
	
} 
	
	
	
}
public class Inheritancedemo {
	public static void main (String[] args) {
	Electriccar electriccar=new Electriccar("unknown","unknown","unknown",0.0);
	electriccar.displayinfo();
}
}

	




