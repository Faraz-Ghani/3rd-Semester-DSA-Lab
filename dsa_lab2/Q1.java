package dsa_lab2;

class Rectangle{
	private float width,length;
	
	public float getwidth() {
		return width;
	}

	public float getlength() {
		return length;
	}

	public void setwidth(float width) {
		
		if(width>0 && width <20) {
		this.width = width;
		}
		else {
			System.out.println("Please enter a value betweeen 0 and 20");
		}
	}

	public void setlength(float length) {
		if(width>0 && width <20) {
			this.length = length;
			}
		else {
			System.out.println("Please enter a value betweeen 0 and 20");
		}
		}

	public Rectangle() {
		width=1;
		length=1;
	}
	
	public float perimeter() {
		float perimeter = 0;
		perimeter+=length*2;
		perimeter+=width*2;
		return perimeter;
		
	}
	
	public float area() {
		float area;
		area=length*width;
		return area;
	}
}

public class Q1 {

	public static void main(String[] args) {
	Rectangle r1 = new Rectangle();
	System.out.println(r1.area());
		r1.setlength(10.3f);
		r1.setwidth(21);
		r1.setwidth(14.3f);
		System.out.println("The area is "+r1.area());
	System.out.println("The perimeter is "+r1.perimeter());
	}

}
