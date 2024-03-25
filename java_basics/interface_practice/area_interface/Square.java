package area_interface; 

public class Square implements Shape{
	public double getArea(double height){
		return Math.pow(height, 2); 
	}
}