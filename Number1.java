class Number1
{
	private int x=10;
	private void display()
	{
		System.out.println("displaying function");
	}

	public static void main(String[] args) 
	{
		Number1 n=new Number1();
		System.out.println(n.x);
		n.display();
	}
}