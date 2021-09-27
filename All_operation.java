class All_Operations{
    public static void main(String args[]){
        int a=10,b=2,c=-10;

        float x1=12.345f,x2=20.145f;

        System.out.println("a="+ a +"\n"+"b="+ b +"\n"+"c="+ c);

        System.out.println("x1="+ x1 +"\n"+"x2="+ x2);

        System.out.println("______________________");

        System.out.println("a + b=" + (a+b));	//’ + ‘ operator

        System.out.println("x1 * x2=" + (x1*x2));	//’ * ‘ operator

        System.out.println("a % b=" + (a%b));		//’% ‘ operator

        System.out.println("a > b=" + (a>b));	//’ > ‘ operator

        System.out.println("a | b=" + (a|b));	//’ | ‘ operator

        System.out.println("c>>2=" + (c>>2));	
        //’>> ‘ operator for negative values

        System.out.println("c>>>2=" + (c>>>2));	
        //’>>> ‘ operator for negative values

        System.out.println("a>>2=" + (a>>2));	
        //’>> ‘ operator for positive values

        System.out.println("a>>>2=" + (a>>>2));	
        //’ >>> ‘ operator for positive values
        System.out.println("a<<2=" + (a<<2));	
        //’ << ‘ operator for positive values

    }
}
