class Box
{
	void Box1(int a, int b)
{
	System.out.println("Add of both values :"+(a+b));
}
	void Box1(int a, int b, int c)
{
	System.out.println("Add of all values :"+(a+b+c));
}
}


class MethodOverloading
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		b1.Box1(2,4);
		b1.Box1(2,4,6);		
	}
}