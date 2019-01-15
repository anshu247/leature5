import java.util.*;
class CircleDemo
{
	public static void main(String []args){
		Circle c=new Circle();//classname object=new classname //new makes a new object
		c.r=2;
		c.displayArea();


		Circle c1=new Circle();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radii:");
		c1.r=scan.nextDouble();

		c1.displayArea();
	}
}