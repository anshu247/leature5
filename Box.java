import java.util.*;
class Box{
	double width;
	double h;
	double length;
	double vol;
	Box(){//non-parametrized
		width=1;
		h=1;
		length=1;

	}
	Box(double w,double h,double l){//parameterized
		this.width=w;
		this.h=h;
		this.length=l;
	}
	Box(double w,double l){//parameterized
		this.width=w;
		this.h=1;
		this.length=l;
	}
	void setDim(){
		System.out.println("enter the length:");
		Scanner scan=new Scanner(System.in);
		length=scan.nextDouble();
		System.out.println("enter the height:");
		
		h=scan.nextDouble();
		System.out.println("enter the breath:");
		
		width=scan.nextDouble();


	}
	double vol(){
		double vol=width*length*h;
		System.out.println("vol="+vol);
		return vol;

	}
}