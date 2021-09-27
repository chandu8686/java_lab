class MyException extends Throwable 
{
    public MyException(String s)
    {
        super(s);
    }
}
  
class Main_c
{
    public static void main(String args[])
    {
        try
        {
            throw new MyException("Im Your Hero");
        }
        catch (MyException ex)
        {
            System.out.println("in Catch block");
            System.out.println(ex.getMessage());
        }
    }
}