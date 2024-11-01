import java.util.Scanner;
class ATM
  {
         public static void main(String[]args)
              {
                    Scanner x = new Scanner(System.in);
                    int choice;
                    Float w,d;
                    float initialAmount=50000;
                    
                    while(true)
                    {
                    System.out.println("Enter choice1.Withdrawl,2.Deposite,3.Available,4.Exit");
                    choice = x.nextInt();
                   
                          
                         switch(choice)
                         {
                             case 1:System.out.println("Enter Withdrawl amount:");
                                    w = x.nextFloat();
                                    initialAmount=initialAmount-w;
                                    break;
                             case 2:System.out.println("Enter amount to deposite:");
                                    d = x.nextFloat();
                                    initialAmount=initialAmount+d;
                                    break;
                             case 3:System.out.println("Your Available Amount="+initialAmount);
                                    break;
                             case 4:System.exit(0);
                                                              
                         }
                    }
                }
    }