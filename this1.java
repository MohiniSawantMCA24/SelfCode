class emp
{
	String name;
	int id;

	emp(String pname,int pid)
	{
		this.name=pname;
		this.id=pid;
	}

	void display()
	{
		System.out.println("Name : "+name+" "+"id : "+id);
	}
}
class this1
{
	public static void main(String args[])
	{
		emp e1=new emp("mohini",001);
		e1.display();
	}
}