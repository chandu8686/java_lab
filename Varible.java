class VarDemo  
{  
    static int m=100;  //static variable  
    int n=200;         //instance variable
    void method_v()  
    {    
        int p=90;   //local variable
        System.out.println(p);
    }  
    public static void main(String args[])  
    {  
        int data=50;  //Local variable 
        System.out.println("local_variable from main method "+data); 
	    System.out.println("static variable"+m);
        VarDemo v=new VarDemo();
        System.out.println("instance variable  "+v.n); //using object only we have to call variable other wise error will occur
        v.method_v(); //using object only we have to call method other wise error will occur
    }  
}//end of class 

