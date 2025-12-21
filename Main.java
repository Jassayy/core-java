//OOPS in Java
public class Main {
       // ->objects
       public static void main(String[] a) {
              Human h = new Human();
              System.out.println(h.getName()); // comes ""
              System.out.println(h.getAge()); // comes 0

              h.setAge(30);
              h.setName("Jas");

              System.out.println(h.getName());
              System.out.println(h.getAge());

              // abstraction
              Vehicle v = new Car(); // object cannot be instantiated from abstract classes and they are incomplete
                                     // in nature but its instantiated via car()
              // which has properties of vehicle and can use its methods
              v.accelerate();
              v.brake();
              v.Start(); //this is done via inheritance
              //start method is inside vehicle and is accessed via car class with the help of inheritance

              //Polymorphism
              Calculator c = new Calculator();
              c.add(1, 2);
              System.out.println(c.res);
              c.add(2, 5, 6);
              System.out.println(c.res); //method name is same but depending on what parameters we send
              //respective of that the method is called
              //this is know as method overloading
              //Also, known as compile-time polymorphism

              //method overriding
              //Also, known as run-time polymorphism
              v.Start(); //child start called
              //method with same name exists inside the child
              //and hence instead of calling parent class method 
              //method is over ridden with childs method with same name
       }

}

// ENCAPSULATION
// WRAPPING DATA AND METHODS INSIDE A SINGLE UNIT I.E A CLASS

class Human {
       int age;
       String name;

       Human() {
              // constructor
              System.out.println("Inside constructor");
              age = 0;
              name = "";

       }

       // setters
       public void setAge(int age) {
              this.age = age;
       }

       public void setName(String name) {
              this.name = name;
       }

       // getters
       public String getName() {
              return name;
       }

       public int getAge() {
              return age;
       }

}

// ABSTRACTION
abstract class Vehicle {
       abstract void accelerate();

       abstract void brake(); // these two methods show what to do
       // but dont show how to do
       public void Start(){
              System.out.println("Vehicle started");
              System.out.println("Parent start called");
       }
}

class Car extends Vehicle {  //inheritance is also done here
       @Override // not required but recommended for compile time safety
       void accelerate() {
              System.out.println("press accelerator");
       }

       @Override
       void brake() {
              System.out.println("Brakes applied");
       }

       public void Start(){
              System.out.println("Child start called");
       }
}

//POLYMORPHISM
class Calculator{
       int res;
       public int add(int a , int b){
              res =  a + b;
              return res;
       }

       public int add(int a , int b , int c){
              res =  a + b + c;
              return res;
       }

       public int showRes(){
              return res;
       }
}
