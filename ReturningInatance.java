class ReturningInatance
{int a =10;
int m1(int a){
  return this.a;
}
public static void main(String[]args)
{
ReturningInatance r = new ReturningInatance();
int num = r.m1(100);
System.out.println("Return value....."+num);
}
}
