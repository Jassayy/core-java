//interfaces in java
//a interface shows what to do but doesnt tell us how to do it
//it is a blueprint of the class

interface testInterface{
       void show(); //abstract class
       //shows what to do
       //does not show how to do
}

class Test implements testInterface{
       public void show(){
              System.out.println("Shown");
       }
}

public class Main {
       public static void main(String[] args){
              Test t = new Test();
              t.show();
       }
       
}