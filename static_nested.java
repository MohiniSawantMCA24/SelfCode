class outerclass
{
	static int outer_x=10;
	private static int outer_private=30;

	static class innerclass
	{
		void display()
		{
			System.out.println("Outer_x : "+outer_x);
			System.out.println("outer_private :"+outer_private);
		}
	}
}
class static_nested
{
	public static void main(String[] args)
	 {
		outerclass.innerclass o1=new outerclass.innerclass();
		o1.display();
	}
}