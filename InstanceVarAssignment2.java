import java.util.Scanner;
class Test
{
int num1 = 20;
int num2 = 30;
}

class InstanceVarAssignment2
{
void add()
{
Test t= new Test();
System.out.println(t.num1 + t.num2);
}
void mul()
{
Test t= new Test();
System.out.println(t.num1 * t.num2);
}
public static void main(String[]args)
{
InstanceVarAssignment d = new InstanceVarAssignment();
d.add();
d.mul();
}
} 