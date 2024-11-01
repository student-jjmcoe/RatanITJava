import java.util.Scanner;
class TakingInput
    {
        public static void main(String[]args)
           {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter Employee Id:\t");
                int eid = s.nextInt();

                System.out.print("Enter Employee Name:\t");
                String ename = s.next();

                System.out.print("Enetr Employee Salary:\t");
                double esal = s.nextDouble();

                if(esal == 100000 && ename.startsWith("s"))
                {
                      System.out.println("Very Good Employee");
                      System.out.println(eid+" "+ename+" "+esal);
                }
                else
                {
                      System.out.println("Good Employee");
                      System.out.println(eid+" "+ename+" "+esal);
                }
                s.close();
           }
     }