class InstanceBlock
{ 
   InstanceBlock()
   {
      System.out.println("0-arg constructor");
   }
   InstanceBlock(int a)
   {
      System.out.println("1-arg constructor");
   }
   {
       System.out.println("Instance Bloack");
   }
   static
   {
       System.out.println("Static Block");
   }
public static void main(String[]args)
{
    new InstanceBlock();
    new InstanceBlock(10);
}
}
