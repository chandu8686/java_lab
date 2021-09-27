interface Interdemo
{
public void call(int param);
public void dis();
}

class Demo implements Interdemo  
{

public void call(int p)
{
System.out.println("Call method called" +p);
}
public void dis()
{
	System.out.println("dis method called");
}

}

class Testinter
{
public static void main(String args[])
{
Interdemo obj=new Demo();
obj.call(10);
obj.dis();

}
}
