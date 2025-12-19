class Car{
       String brand;
       int speed;

       public static void main(String[] args){ // these arguements are command line arguements give before the code runs
              Car c1 = new Car();
              c1.brand = "BMW";
              c1.speed = 120;


              System.out.println(c1.brand);
              System.out.println(c1.speed);

       }
}
//running code -> complie and then run
//javac filename.java
//java file name
//filname.class will get created -> this is bytecode which runs on jvm 