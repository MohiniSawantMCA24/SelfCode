class outer
{
	int x=10;

	class inner
	{
		void display()
		{
			System.out.println("Inner class x :"+x);
		}
	}

	void show()
	{
		inner i=new inner();
		i.display();
	}
}
class inner_demo
{
	public static void main(String[] args)
	 {
		outer o=new outer();
		o.show();
	}
}