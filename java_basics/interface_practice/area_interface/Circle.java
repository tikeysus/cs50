package area_interface; 

public class Circle implements Shape{
	public double getArea(double radius){
		return Math.PI * (Math.pow(radius, 2)); 
	}
}