import java.util.*;
claass PointTest{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Point p1 = new Point(7.0,9.0);
		System.out.println("Enter values for Point1 : ");
		System.out.println("Enter the value for x : ");
		double x = in.nextDouble();
		System.out.println("Enter the value of y : ");
		double y = in.nextDouble();
		Point p1 = new Point(x,y);
		System.out.println("Point 1 x : " + p1.getX() + " y : " + p1.getY());
		 Point p2 = new Point();
		 System.out.println("Enter values for Point 2 : ");
		 System.out.println("Enter the value of x : ");
		 double x = in.nextDouble();
		 System.out.println{"Enter the value for y :"};
		 double y = in.nextDouble();
		 p2.setY();

		 System.out.println("Point 2 x : " + p2.getX() + " y : " + p2.getY());
		 Point p3 = new Point();
		 p3 = p1.distance(p2);
		 System.out.println("Distance x : " + p3.getX() + "y : " + p3.getY());	
		}
}