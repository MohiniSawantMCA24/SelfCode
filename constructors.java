class constructors
{
	int a;

	constructors()
	{
		a=20;
	}

	constructors(int ca)
	{
		a=ca;
	}

	void display()
	{
		System.out.println("Value of a : "+a);
	}

	public static void main(String args[])
	{
		constructors c1=new constructors();
		c1.display();
		constructors c2=new constructors(10);
		c2.display();
	}
}