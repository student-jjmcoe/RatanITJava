import java.util.Scanner;
class EvenOdd
   {
       public static void main(String[]args)
          {
               Scanner x = new Scanner(System.in);
               System.out.println("Enter Number:");
               int num = x.nextInt();

               if(num%2==0)
                  System.out.println("Even");
               else
                  System.out.println("Odd");
          }
     }
               
               