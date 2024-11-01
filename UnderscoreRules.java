class UnderscoreRules
    {
          public static void main(String[]args)
              {
                  int num1 = 44_35_344_55;
                  System.out.println(num1);

                  //not possible
                  //int num2 = _34552;
                  //int num2 = 3452_;
                  //int num2 = _24364_;

                  //double d = 43535_.734536;
                  //double d = 43535._734536;
                  //double d = 43535_._734536;

                  //float f = 255.356_f;
                  //float f = 255.356f_;
                  //float f = 255.356_f_;

                  byte b = 0b1010;
                  int c = 0xaf1;
                  System.out.println(b);
                  System.out.println(c);

                  //not posible
                  //byte b1 = 0B_1010;
                  //byte b1 = _0B1010;
                  //byte b1 = _0B_1010;
                   
              }
    }