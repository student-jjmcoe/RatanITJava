class Demo
{
  static 
  {
     System.out.println("Static block");
  }
  void wish()
  {
     System.out.println("Good Morning");
  }
}
class StaticBlockLoad
{
public static void main(String[]args)throws Exception
{
//Demo x = new Demo();
//x.wish();

//Or
class c = class.forName("Demo");
Demo d = (Demo)c.newInstance();
d.wish();
}
}
