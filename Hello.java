//method overloading

class Calculator {
       int num = 5; // instance variable

       public int addTwoNum(int a, int b) {
              return a + b;
       }

       public int addTwoNum(int a, int b, int c) {
              return a + b + c;
       }

       public double addTwoNum(double a, int b) { // can contain different data type as well
              return a + b;
       }

}

class Student {
       public int age;
       public String name;

       // constructor
       Student(int a, String n) {
              this.age = a;
              this.name = n;
       }
}

public class Hello {
       public static void main(String[] arg) {
              int[] arr = new int[4]; // when we dont have initial values for the array we initialise like this
                                      // (allocating memory of 5 ints) all indexes are 0 initially
              int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 }; // we can initialise like this as well

              // declaring array of objects
              Student[] arr2 = new Student[5]; // array of student of object with size 5
              arr2[0] = new Student(1, "Jas");
              arr2[1] = new Student(0, "null");
              arr2[2] = new Student(3, "null");
              arr2[3] = new Student(3, "null");
              arr2[4] = new Student(3, "null");


              for (int i = 0; i < arr2.length; i++) {
                     System.out.println(arr2[i] + " "); // we are printing arr2 -> contains obj
                     // Student@2a139a55  -> this is one student object and the number is object hash
                     // Student@15db9742
                     // null
                     // null
                     // null

                     System.out.println(arr2[i].name + arr2[i].age); //this will print the data inside obj


              }
       }
}