class ReturningLocal
{
int a =10;
int m1(int a)
{
return a;
}
public static void main(String[]args)
{
ReturningLocal r = new ReturningLocal();
 int num = r.m1(20);
System.out.println("Return value....."+num);
}
}
