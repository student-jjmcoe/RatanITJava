class StaticAssignment2
{
int a = 10;
int b = 20;
static int c =30;
static int d =40;

void add()
{
System.out.println(a+b+StaticAssignment2.c+StaticAssignment2.d);
}
void mul()
{
System.out.println(a*b*StaticAssignment2.c*StaticAssignment2.d);
}
public static void main(String[]args)
{
StaticAssignment2 x = new StaticAssignment2();
x.add();
x.mul();

}
}
