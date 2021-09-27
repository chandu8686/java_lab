class Foreach_D
{
public static void main(String args[])
{
int num[]={1,2,3,4,5};
int sum=0;
//use for-each style for to display and sum the value

for(int x: num)
{
System.out.println("num is:" + x);
sum +=x;
}
System.out.println("sum="+sum);
}
}
