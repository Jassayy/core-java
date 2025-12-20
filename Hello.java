//method overloading

class Calculator {
       public int addTwoNum(int a, int b) {
              return a + b;
       }

       public int addTwoNum(int a, int b, int c) {
              return a + b + c;
       }

}

public class Hello {
       public static void main(String[] arg) {
              Calculator obj = new Calculator();
              int res = obj.addTwoNum(1, 2);
              System.out.println(res);
              int resu = obj.addTwoNum(1, 2, 3);
              System.out.println(resu);

       }
}