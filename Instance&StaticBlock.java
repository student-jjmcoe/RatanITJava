class Instance&StaticBlock
{ 
   Instance&StaticBlock()
   {
      System.out.println("0-arg constructor");
   }
   Instance&StaticBlock(int a)
   {
      System.out.println("1-arg constructor");
   }
   {
       System.out.println("Instance Bloack");
   }
   {
       System.out.println("Instance Bloack");
   }
   static
   {
       System.out.println("Static Block");
   }
   static
   {
       System.out.println("Static Block");
   }
public static void main(String[]args)
{
    new Instance&StaticBlock();
    new Instance&StaticBlock(10);
}
}
