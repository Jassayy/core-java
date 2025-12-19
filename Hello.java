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
             int a = 5;
             int b = 10;
             System.out.println(a<b); //prints true or false

             //if else statements remain the same
             //switch statements
             int day = 9;
             switch (day) {
              case 0:
                    System.out.println(0); 
                     break;
              case 3:
                     System.out.println("Hello bro");
                     break;
             
              default:
                     System.out.println("ew");
                     break;
             }
       }
}