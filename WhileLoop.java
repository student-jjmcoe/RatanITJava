import java.util.Scanner;
class WhileLoop
{
public static void main(String[]args)
{
int guess=25;
Scanner s = new Scanner(System.in);
while(true)
{
System.out.println("Enetr userGuess Value:");
int userGuess = s.nextInt();
if(guess == userGuess)
{
   System.out.println("Your guess is valid congrats");
         break;
}
else if(guess < userGuess)
   System.out.println("Your value is more than guess");
else if(guess > userGuess)
   System.out.println("Your value is less than guess");

}
}
} 