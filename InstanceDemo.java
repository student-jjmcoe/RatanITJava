//error instance to instance direct access is possible but within the same class
class InstanceDemo
{
int num = 100; //instance variable
}

class Test
{
void display()
{
 InstanceDemo d = new InstanceDemo();
 System.out.println(d.num);
}
}