import java.util.Scanner;
class Discount
   {
      public static void main(String[]args)
         {
            Scanner x = new Scanner(System.in);
            System.out.println("Enter a Day:");
            String day = x.next();

            if(day =="Monday"|| day =="Tuseday"|| day == "Wedensday")
                 System.out.println("Discount is 5%");
            else if(day =="Thursday" || day == "Friday")
                 System.out.println("Discount is 4%"); 
            else if(day == "Saturday"|| day == "Sunday")
                 System.out.println("Discount == 3%");
            else
                 System.out.println("Invalid day");
        }
   }