import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle userCircle;
		
		//title
		System.out.println("Welcome to the Circle Tester");
		
		//start loop that allows user to continue entering circles
		boolean cont=true;
		while(cont){
			
			//enter radius
			double radius = InputCheck.getDouble(sc, "\nEnter radius: ");
			userCircle = new Circle(radius);
			
			//get circumference
			System.out.println("Circumference: "+userCircle.getFormattedCircumference());
			
			//get area
			System.out.println("Area: "+userCircle.getFormattedArea());
			
			//continue?
			cont = InputCheck.cont(sc, "\nContinue? (y/n): ");
			
		}
		System.out.print("You created "+Circle.getObjectCount()+" Circle objects.");
	}

}
