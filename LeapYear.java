import java.util.Scanner;
class LeapYear
    {
      public static void main(String[]args)
        {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Year:");
        int y = x.nextInt();

        if(y%4==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
        }

    } 