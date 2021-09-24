class Employee{
int id;
String name;
double salary;

Employee(int id,String name,double salary){
this.id=id;
this.name=name;
this.salary=salary;
System.out.println("Id"+":"+id+"\n"+"Name"+":"+name+"\n"+"Salary"+":"+salary+"\n");
}
public static void main(String args[]){
Employee e1=new Employee(0001,"Chandu",45222.50);
Employee e2=new Employee(0002,"jashu",45222.50);
}
}

