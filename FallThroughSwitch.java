import java.util.Scanner;
class FallThroughSwitch
    {
         public static void main(String[]args)
           {
              Scanner x = new Scanner(System.in);
              int option;
              System.out.println("Enter Option:");
              option = x.nextInt();

              switch(option)
               {
                  case 1:
                  case 2:
                  case 3:System.out.println("Q-1");
                         break;
                  case 4:
                  case 5:
                  case 6:System.out.println("Q-2");
                         break;
                  case 7:
                  case 8:
                  case 9:System.out.println("Q-3");
                         break;
                  default:System.out.println("U Entered Invalid Option");
                          break;
              }
           }
    }