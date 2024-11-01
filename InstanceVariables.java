import java.util.Scanner;
class InstanceVariables
{
int num1 =10;
int num2 =20;
public static void main(String[]args)
{
//static area
InstanceVariables t = new InstanceVariables();
System.out.println(t.num1 + t.num2);
t.add();
}
void add()
{
//Instance Area
System.out.println(num1 + num2);
}
}