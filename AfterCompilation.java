class AfterCompilation
{
   AfterCompilation()
   {
      System.out.println("Instance block.......");
      System.out.println("0-arg cons");
   }
   AfterCompilation(int a)
   {
      System.out.println("Instance block.......");
      System.out.println("1-arg cons");
   }
   
   public static void main(String[] args)
   {
      AfterCompilation x = new AfterCompilation();
      AfterCompilation x1 = new AfterCompilation(10);
   }
}