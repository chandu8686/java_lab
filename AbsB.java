abstract class A{
void m1(){
System.out.println("hello");
}
abstract void m2();
}

class B extends A{
void m2(){
System.out.println("from m2 Method");
}

public static void main(String args[]){
B b=new B();
b.m1();
b.m2();
}
}
