class Test{
int a,b;
Test(int i,int j){
    a=i;
    b=j;
    System.out.println("i and j after call:" + a+ " "+b);
}

void method(Test ob){
    ob.a *=2;
    ob.b /=2;
    System.out.println("a and b after call:" + ob.a+ " "+ob.b);
}
}

class PassObjRef
{
public static void main(String args[])
{
Test ob= new Test(15,20);
System.out.println("a and b before call:" + ob.a+ " "+ob.b);
ob.method(ob);
System.out.println("a and b after call:" + ob.a+ " "+ob.b);
}
}
