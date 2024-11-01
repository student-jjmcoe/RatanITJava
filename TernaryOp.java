class TernaryOp
   {
       public static void main(String[]args)
         {
              if(10>20)
                 System.out.println("Shweta");
              else
                 System.out.println("Chindage");
             
              String str = 10>20 ? "Shweta" : "Chindage";
              System.out.println(str);

              int res = 10<20 && 30>40 ? 100 : 200;
              System.out.println(res);

              //Unicode Conversion
              int x = 10<20 ?'a':20;
              System.out.println(x);

              char ch = 10<20 ? 98 :'a';
              System.out.println(ch);

              //Error
              //10<n ? "Shweta" : 100;
              //not a statement
          }
   }