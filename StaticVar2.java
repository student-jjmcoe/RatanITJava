class StaticVar2
{
int a;//not needed to be initialized
static boolean b;//not needed to be initialized
public static void main(String[]args)
{
double d=1;//need to be initialized
System.out.println(d);

StaticVar2 s = new StaticVar2();
System.out.println(s.a);
System.out.println(StaticVar2.b);
}
}
