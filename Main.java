//super keyword
//by default each constructor has a method know as super() even if we dont initialise it or see it

//super() always calls the contructor of the parent class if present first and then child constructor is called
//this super class will call the default constructor and not the parameterized constructor and hence we can see
//In A and then in B
//and not In int A and int B
//INT b IS CALLED WHEN WE INITIALIZE IBJ WITH PARAMETERIZED CONSTRUCTOR
//but if we want the parameterized super constructor called
//just pass the parameter in super();
public class Main {

       public static void main(String[] a){
              B b = new B(5); 
              // B obj = new B();
              //we are creating an obj with B
              //if an obj is created with B but B extends A
              //Will A constructor be called? Yes
              //Super class which is also known as the parent or base class constructor is also called when any child class obj is created

              //IN BOTH THE ABV CASES 
              //Constructor for A is called and B is called after A depending on the parameters passed in constructor  

       }
}

class A extends Object{ //every class extends to Object
       public A(){
              super(); //present always 
              //A is a super class to B
              //why does it have super as well?
              //every class in java extends to Object
              //the constructor for Object class is called whenever theres no parent class to the super class

              System.out.println("In A");
       }

       public A(int n){
              super();

              System.out.println("In int A");
       }
       
}

class B extends A{
       public B(){
              super();

              System.out.println("In B");
       }

       public B(int n){
              // super(n); //this will call parameterized constructor in A

              this(); //this will call the constructor for the same class and not the super class
              //this will call B() -> B will call super()
              //  -> A constructor will get called
              //output flow would be
              //in A
              //in B
              //in int B

              System.out.println("in int B");
       }
}