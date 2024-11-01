import java.util.Scanner;
class BreakContinue2
    {
       public static void main(String[]args)
          {
              Scanner x = new Scanner(System.in);
              System.out.println("Enter a number:");
              int num = x.nextInt();
 
              for(int i=0;i<10;i++)
               {
                   if(i==num)
                      break;
                   System.out.println(i);
               }
               System.out.println();
               for(int i=0;i<10;i++)
               {
                   if(i==num)
                      continue;
                   System.out.println(i);
               }
           }
    }