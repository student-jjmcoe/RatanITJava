class Demo
{
void info()
{
System.out.println("Hii I am Shweta");
}
}

class MultipleObjectsAtOnce
{
Demo d;
void m1()
{
d = new Demo();
d.info();
}
void m2()
{
d.info();
}
void m3()
{
d.info();
}
public static void main(String[]args)
{
MultipleObjectsAtOnce x = new MultipleObjectsAtOnce();
x.m1();
x.m2();
x.m3();
}
}
