class human
{
void eat()
{
System.out.println("Human is eating");
}
}
class girl extends human
{
void eat()
{
System.out.println("Girl is eating");
}
}
class boy extends human
{
void eat()
{
System.out.println("Boy is eating");
}
}
class runtimepoly
{
public static void main(String args[])
{
human h;
h=new human();
h.eat();
h=new girl();
h.eat();
h=new boy();
h.eat();
}
}