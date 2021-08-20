class Main {
  public static void main(String[] args) {
    System.out.println("Variable Notes");
   
    //Variable must be meaningful can include letters, numbers, _, $ but cannot start with anything but a letter.

    //Case counts so total is different than Total

    //If  word changes color as you type it it is reserved by java and cannot use
   
   //Variables must be declared with a data type (what your going to store)

   //Data types  - int (integers or whole numbers) , double (decimal numbers), String (words), boolean (true/false)
  
   int num1 = 10; //Declaring and initialize the varible
   double num2 = 5;
   double sum;
   boolean flag = true;
   final double PI = 3.14159;//Creates and locks a constant variable

   System.out.println(flag);
   sum = num1+num2*PI;

  
   //Variables are never put inside quotes (“”) in System.out.print statements. This would print the variable name out letter by letter instead of printing its value.
   System.out.println(sum);
   System.out.println(num2);
   System.out.println(num1+num2);
   
   num1 = num1 +1;

   System.out.println(num1);







  }
}