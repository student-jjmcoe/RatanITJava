class Test
{
void registor(String name, long mobile, int age, int SSCRollNo)
{
if(age>18)
      System.out.println("Eligible for Voting"+" "+"Your name:"+name+"Your SSC Roll no.:"+SSCRollNo+"Mobile:"+mobile);
else
      System.out.println("Not Eligible");
}
static void marry(String name,int age,int Balance)
{
if(age<18)
      System.out.println("Not eligible for Marriage try after some time");
else if(age>18 && age<35)
      System.out.println("Eligible for Marriage");
else if(age>35)
      System.out.println("Sorry you are too late");
}
}

class Services
{
public static void main(String[]args)
{
Test x=new Test();
x.registor("Shweta",8010199683l,21,6941);
Test.marry("Shweta",21,11000);
}
}
