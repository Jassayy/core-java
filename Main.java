//static variables in java and static methods
public class Main {
       public static void main(String[] ar) {
              Mobile obj1 = new Mobile();
              obj1.brand = "apple";
              obj1.price = 1500;
              // obj1.name = "Phone"; //affects obj2 as well
              // best practice to use static is like this
              Mobile.name = "Phone"; // dont use obj1.name and so on
              obj1.show();

              Mobile obj2 = new Mobile();
              obj2.brand = "Samsung";
              obj2.price = 1500;

              obj2.show();

              Mobile.show1(); //we can do this shared by all objects
              Mobile.show2(obj2); //here we can print brand as we are passing for which obj we need brand

              Mobile obj3 = new Mobile();
       }
}

class Mobile {
       String brand; // -> these are instance variable now
       int price;
       static String name; // this is static variable now
       // ->instance variables for each object would be different
       // for a variable to be shared by all objects we use static

       //constructor
       public Mobile(){
              brand = "";
              price = 200;
              //we can instantiate name here as well but for each obj this contructor will be called
              //static variable does not need to instantiated everytime an object is created
              //this should happen only once and hence we use 
              //static block
              System.out.println("In constructor");
       }

       //static block-> to instantiate static variable only once when objects are created
       static{
              name = "Chiggi boy";
              //this block will be called only once
              System.out.println("In static block");
       }

       public void show() {
              System.out.println("Brand: " + brand + " name: " + name);
       }

       // static method
       public static void show1() {
              System.out.println("In static method");
              // System.out.println("Brand: " + brand + " name: " + name); //this we cant do as "brand is a non static variable" -> this is because we dont know for which object we are calling the method for
              //and so for using instance variables in static method we need to pass obj as parameter
       }
       public static void show2(Mobile obj){
              System.out.println(obj.brand + " : " + name);
              //here we can access brand
       }
}
