class methodOverLoading
{
void add(int a,int b)
{
int c;
c=a+b;
System.out.println(c);
}
void add(int x,int y,int z)
{
int c;
c=x+y+z;
System.out.println(c);
}
public static void main(String args[])
{
A a1=new A();
    a1.add(10,20);
    a1.add(10,20,30);
}
}