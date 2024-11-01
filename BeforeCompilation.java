class BeforeCompilation
{
   BeforeCompilation()
   {
      System.out.println("0-arg cons");
   }
   BeforeCompilation(int a)
   {
      System.out.println("1-arg cons");
   }
   {
      System.out.println("Instance block.......");
   }
   public static void main(String[] args)
   {
      BeforeCompilation x = new BeforeCompilation();
      BeforeCompilation x1 = new BeforeCompilation(10);
   }
}