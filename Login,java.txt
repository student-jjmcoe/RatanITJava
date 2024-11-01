import java.util.Scanner;
class Login
{
public static void main(String[]args)
{
Scanner a = new Scanner(System.in);
String name = a.next();
String password = a.next();

if(name.equals("shweta") && password.equals("s@134"))
    System.out.println("Login success");
else
    System.out.println("Try after some time");
}
}