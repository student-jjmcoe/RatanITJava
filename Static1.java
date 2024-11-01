class Static1
{
static int a = 40;
static int b = 67;

static void add()
{
System.out.println(Static1.a + Static1.b);
}
static void mul()
{
System.out.println(Static1.a * Static1.b);
}
public static void main(String[]args)
{
Static1 x = new Static1();
Static1.add();
Static1.mul();
}
}
