class DataTypesConversion
     {
         public static void main(String[]args)
           {
                 byte b1 = 10;
                 byte b2 = 20;
                 int b3 = b1 + b2;
                 System.out.println(b3);

                 float f = 10.5f;
                 double d = 20.3;
                 double res = f + d;
                 System.out.println(res);

                 int a = 10;
                 char ch ='a';
                 int result = a + ch;
                 System.out.println(result);

                 char ch1='d';
                 char ch2='a';
                 int ch3 = ch1 + ch2;
                 System.out.println(ch3);

                 String s1 ="Shweta";
                 String s2 ="Chindage";
                 String s= s1 + s2;
                 System.out.println(s);

                 String s3 ="a";
                 char c = 'd';
                 String c2= s3 + c;
                 System.out.println(c2);

                 String x ="aaa";
                 int y = 100;
                 String z = x+y;
                 System.out.println(z);
           }
     }