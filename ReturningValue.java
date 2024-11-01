class ReturningValue
{
static int m1()
{
return 10;
}
public static void main(String[]args)
{
//Holding the return value & printing
int num = ReturningValue.m1();
System.out.println("Return value....."+num);

//Directly printing the return value
System.out.println("Return value....."+ReturningValue.m1());
}
}
