import java.util.Scanner;
class Print
    {
        public static void main(String[]args)
          {
             Scanner x = new Scanner(System.in);
             System.out.println("Enter a Number");
             int num = x.nextInt();
              
             if(num>0)
               {
                   if(num%2==0)
                      System.out.println("Positive and Even");
                   else
                      System.out.println("Positive and Odd");
               }
             else if(num<0)
                {
                   if(num%2==0)
                      System.out.println("Negative and Even");
                   else
                      System.out.println("Negative and Odd");
                }
             else
                 System.out.println("Zero");
          }
    }
             

             