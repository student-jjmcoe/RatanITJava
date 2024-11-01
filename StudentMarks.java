import java.util.Scanner;
class StudentMarks
   {
        public static void main(String[]args)
          {
              char grade=0;
              Scanner x = new Scanner(System.in);
              System.out.print("Enetr Name:\t");
              String name = x.next();
              System.out.print("Enetr Maths Marks:\t");
              float math = x.nextFloat();
              System.out.print("Enetr Science Marks:\t");
              float sci = x.nextFloat();
              System.out.print("Enetr Social Marks:\t");
              float social = x.nextFloat();
              
              float total = math + sci + social;
              float avg = total/3;

              

              if(avg >=70)
                   grade = 'A';
              else if(60<=avg && avg <70)
                   grade = 'B';
              else if(50<=avg && avg<60)
                   grade = 'C';
              else if(40<=avg && avg<50)
                   grade = 'D';
              else if( avg < 40)
                   grade = 'E';
              

              if(grade == 'E')
                  System.out.println("Hii\n"+name+"\nYour Total Marks\t"+total+"\nYour Percentage\t"+avg+"\nSorry You are Failed");
              else
                  System.out.println("Hii\n"+name+"\nYour Total Marks:\t"+total+"\nYour Percentage:\t"+avg+"\nYour Grade is:\t"+grade);
          }
   }
