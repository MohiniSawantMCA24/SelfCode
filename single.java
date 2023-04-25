class A
{
	public void dispA()
	{
		System.out.println("Parent class A");
	}
}
class B extends A
{
	public void dispB()
	{
		System.out.println("child class B");
	}
}
class single
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.dispA();
		b1.dispB();
	}
}