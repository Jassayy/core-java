//dynamic method dispatch

class A{
       public void show(){
              System.out.println("In A");
       }
}

class B extends A{
       public void show(){
              System.out.println("In B");
       }
}


public class Main {

       public static void main(String[] args){
              A obj = new A(); 
              obj.show();
              // creates a reference "obj" of type B class but can we create a reference obj of type A?
              //yes
              obj = new B(); //-> we can do this
              obj.show(); //gives in A

              //dynamic method dispatch means
              //irrespective of type of reference created whether it is A obj and B obj
              //the method called (which is show() in this case) will depend on the object which is used to create that reference
              //on line 19 -> object created with A
              //hence in A is printed
              //in line 23 
              //the type of reference is still A but obj is now created with B
              //and hence show() is called inside B now 



              //Note: all this will work only when inheritance happens
              //when inheritance is not there
              //dynamic method dispatch doesnt work

       

              Computer c = new Laptop(); //WE CAN DO THIS

              //In other words we can create a reference of type PARENT and the object of type CHILD
       }
}

class Computer{

}

class Laptop extends Computer{

}