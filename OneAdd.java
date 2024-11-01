import java.util.Scanner;
class OneAdd
{
static void add(int num1 ,int num2)
{
System.out.println(num1 + num2);
}

public static void main(String[]args)
{
OneAdd.add(20,50);
int x =100,y=200;
OneAdd.add(x,y);

Scanner s = new Scanner(System.in);
System.out.println("Enter first number:");
int val1 = s.nextInt();
System.out.println("Enter second number:");
int val2 = s.nextInt();
OneAdd.add(val1,val2);
}
}
