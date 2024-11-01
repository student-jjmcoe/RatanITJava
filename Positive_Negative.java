import java.util.Scanner;
class Positive_Negative
      {
            public static void main(String[] args)
                {
                    Scanner x = new Scanner(System.in);
                    System.out.println("Enter value:");
                    int num = x.nextInt();

                    if(num>0)
                       System.out.println("Positive");
                    else if(num<0)
                       System.out.println("Negative");
                    else
                       System.out.println("Zero");
                }
       }