class methodover
{
int c;
void add(int a,int b)
{
c=a+b;
System.out.println(c);
}
void add(int f,int h,int j)
{
c=f+h+j;
System.out.println(c);
}
public static void main(String args[])
{
methodover a1=new methodover();
a1.add(10,20);
a1.add(30,40,50);
}
}