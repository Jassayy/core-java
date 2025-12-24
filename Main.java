//inner class
//an inner class is a class defined inside a class
//anonymous inner classes

class A{
       public void show(){
              System.out.println("In A show");
       }

       class B{
              public void config(){
                     System.out.println("In config");
              }
       }

       static class C{
              public void conf(){
                     System.out.println("In static C");
              }
       }
}

public class Main {
       public static void main(String[] args){
              A obj = new A();//Here we can implement the A class but what if we want to something different in its implementation
              //we can define the new class here itself
              A obj1 = new A(){
                     public void show(){
                            System.out.println("In new Show");
                     }
              };

              //this is anonymous inner class of A and does not have a name
              obj.show(); //in A show prints
              obj1.show(); //in new show prints

              A.B obj2 = obj.new B(); //this is how we can implement the inner class

              //if the inner class is static we can directly access it with A obj

              A.C obj3 = new A.C(); //class C is static and hence we can direclty implement it without A obj first 

       }
}
