class InstanceBlock2
{ 
   InstanceBlock2()
   {
      this(10);
      System.out.println("0-arg constructor");
   }
   InstanceBlock2(int a)
   {
      System.out.println("1-arg constructor");
   }
   {
       System.out.println("Instance Bloack");
   }

   public static void main(String[]args)
{
    new InstanceBlock2();
}
}
