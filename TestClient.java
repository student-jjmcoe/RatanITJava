class Test
{
double totalBill(String pname, double cost, int quantity)
{
    double bill;
    bill = cost*quantity;
    return bill;
}

static int productOrder(String name, String location, int cost)
{
    if(cost>100)
      return 12345;
    else 
      return 9876;
}
}

class TestClient
{
public static void main(String[]args)
{
Test t = new Test();
double bill = t.totalBill("Pen",1000,5);
System.out.println("Your total bill......."+bill);

int orderID = Test.productOrder("shirt","Kolhapur",200);
System.out.println("your order ID ..........."+orderID);
}
}
