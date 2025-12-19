class Hello{
       int instVar = 10;

       static String s = "I am statuc";

       //method
       public void showVar(){
              int localVar = 50;

              System.out.println("Ins var - " + instVar);
              System.out.println("static var - " + s);
              System.out.println("Local var - " + localVar);

       }
       public static void main(String[] arg){
              //creating object 
              Hello obj1 = new Hello();
              obj1.showVar();
              Hello obj2 = new Hello();
              obj2.instVar = 100; //obj1 inst variable still remains 10 but for obj 2 it becomes 100
              obj2.showVar();
              Hello.s = "This is static and will be shared among all objects";
              obj1.showVar();
              obj2.showVar();
       }
}