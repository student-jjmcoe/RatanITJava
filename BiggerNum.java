import java.util.Scanner;
class BiggerNum
   {
       public static void main(String[]args)
         {
             Scanner x = new Scanner(System.in);
             System.out.println("Enter Two Numbers:");
             int a = x.nextInt();
             int b = x.nextInt();
         
             if(a>b)
                 System.out.println("bigger number is:"+a);
             else
                 System.out.println("bigger number is:"+b);
         }
   }
             