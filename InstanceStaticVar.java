class InstanceStaticVar
{
int x,y,z;
int i=10,j,k;

static int a=10,b=20,c;
static int d,e=100,f;

public static void main(String[]args)
{
InstanceStaticVar t = new InstanceStaticVar();
System.out.println(t.x+" "+t.y+" "+t.z);
System.out.println(t.i+" "+t.j+" "+t.k);

System.out.println(InstanceStaticVar.a+" "+InstanceStaticVar.b+" "+InstanceStaticVar.c);
System.out.println(InstanceStaticVar.d+" "+InstanceStaticVar.e+" "+InstanceStaticVar.f);

}
}
