class ConstructorCalling
{
ConstructorCalling()
{
    this(10);
    System.out.println("0-arg Cons");
}
ConstructorCalling(int a)
{
    this(30,40);
    System.out.println("1-arg cons");
}
ConstructorCalling(int a, int b)
{
     System.out.println("2-arg cons");
}
public static void main(String[]args)
{
  new ConstructorCalling();
}
}
