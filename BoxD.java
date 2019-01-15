class BoxD{
	public static void main(String []args)
	{
		Box b1=new Box();
		b1.setDim();
		b1.vol(); 
		Box b2=new Box();
		Box b3=new Box(3,5,4);
		Box b4=new Box(3,9);
		b2.vol();
		b3.vol();
		b4.vol();

	}
}