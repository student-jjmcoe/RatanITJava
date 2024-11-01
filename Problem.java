class Problem
{
void add(int a, int b)
{
   System.out.println("Addition="+(a+b));
}
void mul(int a , int b)
{
   System.out.println("Multiplication="+(a*b));
}
void div(int a , int b)
{
   System.out.println("Division="+(b/a));
}

public static void main(String[]args)
{
Problem p = new Problem();
p.add(10,20);
p.mul(10,20);
p.div(10,20);
}
}
