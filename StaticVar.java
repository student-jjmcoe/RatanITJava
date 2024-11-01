class StaticVar
{
static int num1 =100;
static int num2 =200;
public static void main(String[]args)
{
System.out.println(StaticVar.num1 +StaticVar.num2);
StaticVar s = new StaticVar();
s.add();
}
void add()
{
System.out.println(StaticVar.num1 + StaticVar.num2);
}
}

