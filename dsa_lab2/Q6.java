package dsa_lab2;

 class Vehicle {

	  String manufacturer;
	  int speed;
	  int year;

	  public int getYear() {
	    return year;
	  }

	  public void setYear(int year) {
	    this.year = year;
	  }

	  public String getManufacturer() {
	    return manufacturer;
	  }

	  public void setManufacturer(String manufacturer) {
	    this.manufacturer = manufacturer;
	  }

	  public int getSpeed() {
	    return speed;
	  }

	  public void setSpeed(int speed) {
	    this.speed = speed;
	  }

	  public void accelarate() {
	    this.speed += 10;
	  }

	  public void brake() {
	    this.speed -= 10;
	  }
	}

public class Q6{
	public static void main(String[] args) {
	    Vehicle rickshaw = new Vehicle();
	    
	    rickshaw.setManufacturer("BMW");
	    rickshaw.setSpeed(5);
	    rickshaw.setYear(1997);
	    Vehicle bike = new Vehicle();
	    bike.setYear(2019);
	    bike.setManufacturer("Hyuandi");
	    bike.setSpeed(6);
	    for (int i = 1; i < 6; i++) {
	      bike.accelarate();
	      rickshaw.accelarate();
	      System.out.println(
	        "Bike speed after " + i + "th accelariton : " + bike.getSpeed()
	      );
	      System.out.println(
	        "Rickshaw speed after " + i + "th accelariton : " + rickshaw.getSpeed()
	      );
	    }
	    for(int i = 1 ; i < 3;i++){
	        bike.brake();
	        rickshaw.brake();
	        System.out.println("Bike speed after " + i + "th brake : " + bike.getSpeed());
	     
	        System.out.println("Rickshaw speed after " + i + "th brake : " + rickshaw.getSpeed());
	
	}
}}