class Operations
{
void wish()
{
System.out.println("Good Morning");
}
void add(int num1, int num2)
{
int res = num1 + num2;
System.out.println(res);
}
static void login(String username, String password)
{
if(username.equals("Shweta")&&password.equals("@1234"))
{
System.out.println("Login Successful="+username);
}
else
{
System.out.println("Login Fail="+username);
}
static void courseInfo(String name, String course){
if(course.equals("corejava")
{
System.out.println("hi "+name+" corejava Faculty Mr. Ratan fee:3000");
}
else if(course.equals("python")
{
System.out.println("hi "+name+" python Faculty Mr. Ratan fee:5000");
}
else
{
System.out.println("hi "+name+" the course is not available");
}
static void disp(int a, char ch, double d, boolean b)
{
System.out.println(a+" "+ch+" "+d+" "+b);
}

class DiffMethods
{
public static void main(String[]args)
{
Operations op = new Operations();
op.wish();
op.add(10,40);
Operation.login("Shweta","@1234");
Operation.courseInfo("Shweta", "corejava");
Operation.disp(11,'a',12.12,true);
}
}
