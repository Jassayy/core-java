//encapsultaion -> encapsulating code inside classes
class Human{
       int age; //-> can be accessed anywhere
       String name;
       //if we want data to be accessible only inside this class
       //we use private keyword
       private String hobbies;

       public void setHobbies(String hobbies){
              //this is setter method
              this.hobbies = hobbies; //-> we use this keyword to access the variable inside the class as we are using same name in parameter
              //by this we mean we are talking about a hobbies var inside the same class 
              //this keyword refers to the current object
       }
       

       public String getHobbies(){ //this is basically a getter method
              return hobbies;
       }

       
}

public class Main {

       public static void main(String[] a){
              Human h = new Human();
              h.age = 19;
              h.name = "Jas";
              // h.hobbies ; -> this we cant do as hobbies is private and can be accessed only inside Human class 
              //in order to access this we can create public methods inside that class

              System.out.println(h.name);
              System.out.println(h.getHobbies());
              h.setHobbies("Hiiiieee!");
              System.out.println(h.getHobbies());
       }
}