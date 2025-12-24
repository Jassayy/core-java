//wrapper classes
//every primitive data type can be stored directly in stack memory without objects
//but what if we have a framework that uses only objects
//we have wrapper classes for overcoming this
//int -> Integer (wrapper class this is)
//float -> Float
//double -> Double and so on
//these wrapper classes extends to Object class

public class Main {
       public static void main(String[] args){
              int n = 9;
              //with wrapper class
              Integer n1 = n;
              //or
              Integer n2 = new Integer(n); //this syntax is deprecated but we can use 
              //this concept is known as AUTOBOXING
              //storing primitive values in the form of object

              //n1 or n2 will have certain methods in it as well
              //in order to assign it to a primitive variable again we have the intValue() method
              int num = n2.intValue(); //this is know as AUTOUNBOXING
              //IT CAN HAPPEN AUTOMATICALLY AS WELL
              int num1 = n2; //no need to pass intValue()
              //this will assign the int value in object to the primitive variable num

              //we can convert string to integer as well
              String str = "123";
              int s = Integer.parseInt(str);
              //this will convert the string to int      
              System.out.println(s+1);
       }
}
