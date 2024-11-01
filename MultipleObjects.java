class Demo
{
void info()
{
System.out.println("Hii I am Shweta");
}
}

class MultipleObjects
{
void m1()
{
Demo d = new Demo();
d.info();
}
void m2()
{
Demo d = new Demo();
d.info();
}
void m3()
{
Demo d = new Demo();
d.info();
}
public static void main(String[]args)
{
MultipleObjects x = new MultipleObjects();
x.m1();
x.m2();
x.m3();
}
}
