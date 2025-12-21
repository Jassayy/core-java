//strings
public class Main {
       public static void main(String[] ar){
               String name = new String("Jas and Riya");
              //  String s = "Jas and Riya"; //this is valid as well
               System.out.println(name.charAt(0));
               System.out.println(name.substring(8));
               System.out.println(name);
               System.out.println(name.hashCode());
               System.out.println("Hello" + name);//concatenation

               //mutable and immutable strings
              String n = "Jas";
              n = n+" Gandhi"; //this works
              //but the original n is not getting altered here
              //in heap -> string constant pool exists
              //checks if the string is already there in heap or no
              //if it already exists
              //no more object is created
              //memory reference for all strings remain the same
              //for eg-> String s1 = "jas";
              //String s2 = "jas";
              //both these strings are same and hence only 1 obj is created but both point to the same memory location in heap
              
              System.out.println("hello " + n);
              //but when we did name + "Gandhi"
              //it checked in scp if it exists
              //it doesnt exist
              //so new object is created with new mem location
              //and the reference to it is updated
              //i.e name points to another memory location now in heap which has Jas Gandhi
              //prev location in heap which had only Jas is kept for garbage collection

       }
}
