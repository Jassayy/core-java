interface Vehicle {
       void changeGear(int a);

       void applyBrakes(int a);

       void speedUp(int a);
       // this interface defines how specific classes should behave
}

class Cycle implements Vehicle {
       int speed;
       int gear;

       public void changeGear(int newGear) {
              gear = newGear;
       }

       public void applyBrakes(int dec) {
              speed = speed - dec;
       }

       public void speedUp(int inc) {
              speed = speed + inc;
       }

       public void printStates() {
              System.out.println("speed: " + speed + "gear: " + gear);
       }
}

class Car implements Vehicle {
       int speed;
       int gear;

       public void changeGear(int newGear) {
              gear = newGear;
       }

       public void applyBrakes(int dec) {
              speed = speed - dec;
       }

       public void speedUp(int inc) {
              speed = speed + inc;
       }

       public void printStates() {
              System.out.println("speed: " + speed + "gear: " + gear);
       }
}


//multiple inheritance is possible in java with the help of interfaces

interface Add{
       void add(int a,int b);
}
interface Sub{
       void sub(int a,int b);
}

//this class inplements both interfaces
class Calc implements Add, Sub
{
       public void add(int a , int b){
              System.out.println(a+b);
       }

       public void sub(int a,int b){
              System.out.println(a-b);
       }
}

//interfaces can also define default methods
interface Display{
       default void display(){
              System.out.println("Hello");
       }

       //can have static methods as well
       static void display1(){
              System.out.println("Hello my g");
       }//can be called using directly the interface name and doesnt need a class
}


public class Main implements Display{

       public static void main(String[] args){
              Cycle c = new Cycle();
              c.speedUp(2);
              c.changeGear(6);
              c.applyBrakes(3);

              System.out.println("cycle state: ");
              c.printStates();

              Car b = new Car();
              b.speedUp(2);
              b.changeGear(6);
              b.applyBrakes(3);
              
              System.out.println("car state: ");
              b.printStates();

              Calc x = new Calc();
              x.add(4, 0);
              x.sub(4, 5);

              Main m = new Main();
              m.display(); //interface can implement default methods

              //static method in interface
              Display.display1();

       }
}