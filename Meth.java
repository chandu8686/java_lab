class Meth{
static void wel(){
System.out.println("From Static method");
}

void m1(){
System.out.println("From instance method 1");
}

void m2(String name){
System.out.println(name+" "+"From instance method 2");
}
void m3(int id,String name){
System.out.println(id +" " +name+" "+"From instance method 1");
}

public static void main(String args[]){
wel();
Meth m=new Meth();
m.m1();
m.m2("Chandu");
m.m3(1,"chandu");
}
}

