import java.util.Scanner;
class WhileEmployee
{
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
while(true)
{
Sytsem.out.println("Enter Employee Id");
int eID=12345;

System.out.println("Enter Employee Name");
String ename = s.next();

System.out.println("Enter Employee Salary");
double esal = s.nextDouble();

System.out.println("eid="+eID);
System.out.println("ename="+ename);
System.out.println("esal="+esal);

System.out.println("Do you want one more record enter Yes or No");
String choice = s.next();
if(choice.equals(No)
       break;
}
}
} 