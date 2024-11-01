class Solution
{
int a;
int b;
Solution(int a, int b)
{
 this.a = a;
 this.b = b;
}
void add()
{
   System.out.println("Addition="+(a+b));
}
void mul()
{
   System.out.println("Multiplication="+(a*b));
}
void div()
{
   System.out.println("Division="+(b/a));
}

public static void main(String[]args)
{
Solution p = new Solution(10,20);
p.add();
p.mul();
p.div();
}
}
