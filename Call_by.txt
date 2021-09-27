class Demo
{
void method(int i,int j)
{
i *=2;
j /=2;
System.out.println("a and b after call:" + i+ " "+j);
}
}

class CallByValue
{
public static void main(String args[])
{
Demo ob= new Demo();
int a=15, b=20;

System.out.println("a and b before call:" + a+ " " +b);
ob.method(a,b);
System.out.println("a and b after call:" + a+ " "+b);
}
}
