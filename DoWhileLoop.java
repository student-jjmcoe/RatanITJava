import java.util.Scanner;
class DoWhileLoop
{
public static void main(String[]args)
{
do{
System.out.println("Shweta");
} while(20<10);
System.out.println();

int i=0;
do{
System.out.println("Good Morning");
i++;
} while(i<10);
System.out.println();

//Error : Unreachable
//do{
//System.out.println("Good Evening");
//} while(true);
//System.out.println("Good Night");
//System.out.println();


do{
System.out.println("Hii");
} while(false);
System.out.println("bye");

}
} 