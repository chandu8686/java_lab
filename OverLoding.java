class CalculateSquare
 {
public void square()
 {
System.out.println("No Parameter Method Called");
 }
public int square( int number )
{
int square = number * number;
System.out.println("Method with Integer Argument Called:"+square);
return 0;
}
public float square( float number )
{
 	float square = number * number;
 	System.out.println("Method with float Argument Called:"+square);
	return 0;
}
 
public static void main(String[] args)
  {
    CalculateSquare obj = new CalculateSquare();
    obj.square();
    obj.square(5);  
    obj.square(2.5f);  
  }
 }
