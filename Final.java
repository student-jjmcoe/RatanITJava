class NotDefault
{
Test(int a)
{
    System.out.println("1-arg cons");
}
public static void main(String[]args)
{
Test t1 = new Test();
Test t2 = new Test(10);
}
}
