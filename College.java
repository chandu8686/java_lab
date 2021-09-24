class College{
static void admin(){
System.out.println("admin method");
}
void student(){
System.out.println("Student method");
}
void Staff(){
System.out.println("staff method");
}
}

class Loyola extends College{
public static void main(String args[]){
Loyola l=new Loyola();
l.admin();
l.student();
l.Staff();
}
}


