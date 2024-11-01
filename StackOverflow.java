class StackOverflow
{
   void m2()
   {
       m1();
   }
   void m1()
   {
        m2();
   }
   public static void main(String[] args)
{
    StackOverflow x = new StackOverflow();
    x.m1();
}
}