class Circle
{
	double r;
	double findArea(){
		return (r*r*3.14);
	}
	void displayArea(){
		System.out.println("Area="+findArea());
	}
}