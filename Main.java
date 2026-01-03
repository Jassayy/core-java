public class Main {

       public static void main(String[] args) {
              int i = 0, j = 0;
              int[] arr = new int[5];

              try {

                     if (i == 0) {
                            throw new MyException("Cannot divide by zero - custom exception");
                     }
                     j = 18 / i;

                     if (j == 0) {
                            throw new MyException("This is customised exception");
                     }

                     System.out.println(arr[5]);

              } catch (MyException e) {
                     // TODO: handle exception
                     System.out.println(e); // gives exception

                     // array index out of bounds exception
                     // arithmetic exceptions
                     // we can have customized exceptions as well
              }

              System.out.println("Outside try catch block");
       }
}

class MyException extends Exception { // we need to extend to exception as it needs to be a subclass of throwable
       public MyException(String s) {
              // System.out.println(s); //this doesnt work
              //to print we need to call constructor of superclass as it is handled by the exception class
              super(s);
       }

}