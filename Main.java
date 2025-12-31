
//enums
enum Status {
       Running("Jas"), Failed("jas"), Success();

       private String s;

       private Status() {
              System.out.println("In default constructor");
       }

       // can have constructors here as well
       private Status(String s) {
              this.s = s;
              System.out.println("In parameterised constructor");
       }

       // can have setter and getters as well
}

public class Main {
       public static void main(String[] args) {

              Status s = Status.Failed;

              System.out.println(s);

              System.out.println(s.ordinal()); // index of that enum starting from 0

              for (Status s1 : Status.values()) {// this will give the array of enum objects
                     System.out.println(s1);

              }
       }
}
