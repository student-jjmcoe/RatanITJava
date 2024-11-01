class UserdefinedConstructor
{
    UserdefinedConstructor()
    {
       System.out.println("0-arg constructor");
    }
    UserdefinedConstructor(int a)
    {
       System.out.println("1-arg Constructor");
    }
public static void main(String[]args)
{
    UserdefinedConstructor t = new UserdefinedConstructor();
    UserdefinedConstructor t1 = new UserdefinedConstructor(10);
}
}
