package myPackage;

class MyClass
{
    public void getNames(String s)
    {        
        System.out.println(s);        
    }
    public static void main(String args[]){
        MyClass c=new MyClass();
        c.getNames("Chandu");
    }
}