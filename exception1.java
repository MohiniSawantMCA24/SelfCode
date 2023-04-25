import java.util.*;
class exception1
{
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		if(age<60)
		{
			System.out.println("invalid age");
		}
		else 
		{
			System.out.println("valid age");
		}
	}
}
	 