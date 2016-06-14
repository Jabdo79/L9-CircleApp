import java.text.DecimalFormat;

public class Circle {
	
	private static int circlesCreated = 0;
	private double radius = 0;
	
	public Circle(double radius){
		this.radius = radius;
		circlesCreated++;
	}
	
	public double getCircumference(){
		return 2*Math.PI*this.radius;
	}
	
	public String getFormattedCircumference(){
		return this.formatNumber(this.getCircumference());
	}
	
	public double getArea(){
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	public String getFormattedArea(){
		return this.formatNumber(this.getArea());
	}
	
	private String formatNumber(double x){
		DecimalFormat df = new DecimalFormat("#.00");
		return ""+df.format(x);
	}
	
	public static int getObjectCount(){
		return circlesCreated;
	}
}
