class Practice{
       public static void main(String args[]){
              float a = 51.2f;
              int b = (int)a; //type casting
              //converting float to integer
              System.out.println(b);

              byte c = 10;
              byte d = 30;
              // c*d; //c*d will go out of byte range which is 256
              //so this will directly get promoted to integer so we can store it in integer 
              //this is know as type promotion
              int res = c*d;
              System.out.println(res);

       }
}