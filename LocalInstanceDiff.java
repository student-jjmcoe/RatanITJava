class LocalInstanceDiff
{
    int val1 =10,val2 =20; //instance variable
    void add(int num1, int num2)
{
    System.out.println(num1 + num2);
    System.out.println(val1 + val2);
}
public static void main(String[]args)
{
     LocalInstanceDiff x = new LocalInstanceDiff();
     x.add(30 , 40);
}
}