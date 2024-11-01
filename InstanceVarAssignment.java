import java.util.Scanner;
class InstanceVarAssignment
{
int num1 = 20;
int num2 = 30;
void add()
{
System.out.println(num1 + num2);
}
void mul()
{
System.out.println(num1 * num2);
}
public static void main(String[]args)
{
InstanceVarAssignment t = new InstanceVarAssignment();
t.add();
t.mul();
}
} 