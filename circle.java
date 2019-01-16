import java.util.*;
class Circle
{
	double r;
	Circle()
	{
		this.r=1;

	}
	Circle(double r)
	{
     this.r=r;

	}
	double area()
	{
		return(3.14*r*r);

	}
	double circum()
	{
		return(2*3.14*r);
	}
	double display(double area,double circum)
	{
		return(System.out.println(area);
		System.out.println(circum);)
	}
}


class CircleTest
{   
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		Circle a1=new Circle();
		double area=a1.area();
		double circum=a1.circum();
		a1.display(area,circum);
		Circle a2;
		System.out.println("enter the value of radii of thre circle of which u want to make the circle:");
		double r=scan.nextInt();
		 a2=new Circle(r);
        area=a2.area();
        circum=a2.circum();
        a2.display(area,circum);

	}
}
