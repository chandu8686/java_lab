class A{
//static variable
static int a=10;
//satic method
static void greet(){
 System.out.println("Hello  Welcome !");
}
//instance variable
String h="Tharun";
//instance method
void wname(String name){
System.out.println(name+" "+"greate to hear");
}

public static void main(String args[]){
System.out.println(a);
greet();
A aa=new A();
System.out.println(aa.h);
aa.wname("Chandu Reddy");
}
}


