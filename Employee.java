class Employee
{//instance var
  int eid;
  String ename;
  double esal;
  String Company;
  String addr;

Employee(int eid, String ename, double esal, String Company,  String addr)
{
    this.eid = eid;
    this.ename = ename;
    this.esal = esal;
    this.Company = Company;
    this.addr = addr;
}
void status()
{
    if(esal > 150000)
    {
        System.out.println("Very Good Employee");
    }
    else
    {
        System.out.println("Good Employee");
    }
}
public static void main(String[]args)
{
 Employee emp = new Employee(1234,"Shweta",1000000,"TCS","xyz");
 emp.status();

 Employee emp1 = new Employee(1234,"Shweta",1000000,"TCS","xyz");
 emp1.status();
}
}
