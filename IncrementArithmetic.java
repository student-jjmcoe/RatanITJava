class IncrementArithmetic
    {
         public static void main(String[]args)
              {
                    int a = 10;
                    System.out.println(a++ + ++a);
                    System.out.println(++a - a++);
                    System.out.println(a-- + --a);
                    System.out.println(--a - a--);

                    int b = 10;
                    System.out.println(a++ + ++a + a-- + --a);
                    System.out.println(a++ - ++a - --a - a--);
              }
    }