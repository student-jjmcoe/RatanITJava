import java.util.Scanner;
class Pin
  {
     public static void main(String[]args)
       {
           int pin1 = 1234;
           Scanner s = new Scanner(System.in);
           int pin2 , x=0;
           for(int i=0;i<4;i++)
             {
                 System.out.println("Enetr the Pin:");
                 pin2 = s.nextInt();

                 if(pin1 == pin2)
                   {
                       System.out.println("Congratulations pin is valid");
                       x=0;
                       break;
                   }
                 else{
                    x=1;
                     }
              }
           if(x==1)
              System.out.println("Bye Bye Your account blocked");
       }
   } 