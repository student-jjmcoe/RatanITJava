import java.util.Scanner;
class Day
  {
      public static void main(String[]args)
      {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Day");
        String day = x.next();
      
        switch(day)
         {
             case "mon" : System.out.println("Weekdays Focus on Work");
                        break;
             case "tus" : System.out.println("Weekdays Focus on Work");
                        break;
             case "wed" : System.out.println("Weekdays Focus on Work");
                        break;
             case "thu" : System.out.println("Weekdays Focus on Work");
                        break;
             case "fri" : System.out.println("Weekdays Focus on Work");
                        break;
             case "sat" : System.out.println("Weekend enjoy the party");
                        break;
             case "sun" : System.out.println("Weekend enjoy the party");
                        break;
             default    : System.out.println("Not a valid day");
         }
     }
  }