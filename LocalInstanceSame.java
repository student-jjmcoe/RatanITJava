class LocalInstanceSame
{
int num1 = 10;
int num2 = 20;
void add(int num1, int num2)
{
   LocalInstanceSame x = new LocalInstanceSame();  
   System.out.println(x.num1+x.num2);
//or
   System.out.println(this.num1 + this.num2);

   System.out.println(num1 + num2);
}
public static void main(String[]args)
{
   LocalInstanceSame x = new LocalInstanceSame();
   x.add(90,10);
}
}
