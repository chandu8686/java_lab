class StringDemo {
    public static void main(String[] args) {
   
      // create first string as literal
      String first = "Java ";
      System.out.println("First String: " + first);
   
      // create second
      String second = "Programming";
      System.out.println("Second String: " + second);
   
      // join two strings
      String str = first.concat(second);
      System.out.println("Joined String: " + str);
   
  // get the length of greet
      int length =str.length();
      System.out.println("Length: " + length);
  // compare first and second strings
      boolean result1 = first.equals(second);
      System.out.println("Strings first and second are equal: " + result1);
  // create a string using the new keyword
  String name = new String("Java String");
  System.out.println(name);
   
  // returns character at index 2
   System.out.println(name.charAt(2));
   
    }
  }
  