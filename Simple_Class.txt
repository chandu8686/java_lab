class Box {
		double width;
		double height;
		double depth;
}

class  BoxDemo
{
 public static void main(String args[])
{
   //creating Box object called obj1 
	Box obj = new Box();  //Box() constructor
	
	double volume;

//Assign values to obj1’s instance variables
obj.width=100;
obj.height=50;
obj.depth=70;

volume=obj.width *obj.height * obj.depth;
	
System.out.println("Volume=" + volume);
}
}
