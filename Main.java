//final keyword -> can be used with variable, methods , classes

public class Main {

       public static void main(String[] args){
              int n = 9;
              n = 10; //we can change the value of n
              System.out.println(n);

              final int m = 69;
              // m = 67; //this we cannot do as final keyword is used
              System.out.println(m);

              A obj = new A();
              obj.show();
       }
}

//final class
final class A{
       public void show(){
              System.out.println("In A show");
       }
}
//we dont want any class to inherit A so we use final keyword in A class so that B cannot inherit its features
class B /*extends A*/{ //extends A will not work
       public void show(){
              System.out.println("In B show");
       }
}

//final method
class C{
       public final void show(){
              System.out.println("In C show");
       }

      
}
//this can happen but we dont want to method overriding happening so we can use final keyword for method
//now show() cannot be used in the child class
class D extends C{
       public void show(){ //cannot do this
              //method overriding stops
              System.out.println("In D show");
       }
}