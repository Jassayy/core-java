public class Main {

       public static void main(String[] args){
              A obj = new A();
              obj.show1(); //only show1 can be accessed cuz A doesnt know what B is

              A obj1 = (A) new B(); //Dynamic method dispatch concept but we are type casting the B object into A object 
              //this is know as up casting
              obj1.show1();

              B obj2 = new B(); 
              //or instead we can do this
              B obj3 = (B) obj1; //same same 
              //obj1 refers to type A but we can cast it to type B
              //this is know as down casting
              obj2.show2(); //here we can call show2
              obj3.show2();//works
       }
}

class A{
       public void show1(){
              System.out.println("In show A");
       }
}

class B extends A{
       public void show2(){
              System.out.println("In show B");
       }
}