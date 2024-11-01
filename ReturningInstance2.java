class ReturningInstance2
{
int a= 10;
int m1()
{
  return a;
}
public static void main(String[]args)
{
  ReturningInstance2 x=new ReturningInstance2();
  int num = x.m1();
  System.out.println("Return value........."+num);
}
}
