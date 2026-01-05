//threads in java -> the smallest unit of execution within a process that can be scheduled by the operating system
//runs parallel to each other

//multiple threads

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

// when we do extends Thread...now they are not normal classes they are threads
// but still the process executes sequentially
// for that we use .start() method to start execution of the thread

public class Main

{

    public static void main(String args[])

    {
        A obj = new A();
        B obj1 = new B();

        // obj.show();
        // obj1.show();

        obj.start(); // change show() -> run() as start calls run
        obj1.start();
    }

}

//BY DOING THIS
//these threads run simultaneously but the output is kinda 
//hi
//hi
//hello
//hello
//etc etc