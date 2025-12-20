//methods
class Computer {
       public void playMusic() {
              System.out.println("Music playing");
       }

       public String getPen(int cost) {
              if (cost > 10) {

                     return "pen";
              } else {
                     return "Chiggi boy";
              }
       }
}

public class Hello {
       public static void main(String[] arg) {
              Computer obj = new Computer();
              String s = obj.getPen(15);
              System.out.println(s);
              obj.playMusic();
       }
}