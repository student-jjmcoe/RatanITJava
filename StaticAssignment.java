class StaticAssignment
{
static int a = 20;
static int b = 30;

static void add()
{
System.out.println(StaticAssignment.a + StaticAssignment.b);
}
static void mul()
{
System.out.println(StaticAssignment.a * StaticAssignment.b);
}
public static void main(String[]args)
{
StaticAssignment x = new StaticAssignment();
x.add();
x.mul();
}
}
