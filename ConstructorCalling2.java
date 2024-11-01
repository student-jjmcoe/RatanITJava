class ConstructorCalling2
{
ConstructorCalling2()
{
    this(10);
    this(30,40);
    System.out.println("0-arg Cons");
}
ConstructorCalling2(int a)
{
    
    System.out.println("1-arg cons");
}
ConstructorCalling2(int a, int b)
{
     System.out.println("2-arg cons");
}
public static void main(String[]args)
{
  new ConstructorCalling2();
}
}
