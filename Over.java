class Over{
void m1(){
System.out.println("Hello");
}
void m1(int id){
System.out.println(id+ " " +"Id from m1 with integer its overriding");
}

void m1(String name){
System.out.println(name +" "+"from m1 method with String");
}
public static void main (String args[]){
Over o=new Over();
o.m1();
o.m1(12222);
o.m1("Chandu Reddy");
}
}
 

