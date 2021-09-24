class Start extends Thread{
public void run(){
System.out.println("Thread is Running ");
}
public void m2(){
System.out.println("Welcome");
}

public static void main(String args[]){
Start s=new Start();
s.start();
}
}