class Multi_th implements Runnable{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    Multi_th m1=new Multi_th();  
    Thread t1 =new Thread(m1);  
    t1.start();  
    }  
    }  