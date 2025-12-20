//method overloading

class Calculator {
       int num = 5; //instance variable
       public int addTwoNum(int a, int b) {
              return a + b;
       }

       public int addTwoNum(int a, int b, int c) {
              return a + b + c;
       }

       public double addTwoNum(double a , int b){ //can contain different data type as well
              return a+b;
       }

}

public class Hello {
       public static void main(String[] arg) {
              Calculator obj = new Calculator();
              int res = obj.addTwoNum(1, 2);
              System.out.println(res);
              int resu = obj.addTwoNum(1, 2, 3);
              System.out.println(resu);
              double result = obj.addTwoNum(1.2, 6);
              System.out.println(result);
              Calculator obj1 = new Calculator();
              obj1.num = 30;
              System.out.println(obj1.num); //each object has its own copy of inst variable
              System.out.println(obj.num);
              //but for static variables
              //they are shared with all objects and a change in any object will refelct in all objects

       }
}