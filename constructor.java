class constructor
{
String name;
int id;

display employee()
{
name="Darshan";
id=001;
}
employee(String pname,int pid)
{
name=pname();
id=pid();
}
void display()
{
System.out.println(name,id);
}
public static void main(String args[])
{
employee e1=new employee();
                  e1.display();
employee e2=new employee();
                   e2.display();
}
}