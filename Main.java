//string buffer and string builder
public class Main {
       public static void main(String[] ar){
              StringBuffer sb = new StringBuffer("Jas"); //mutable and thread safe
              //instead of creating new objects
              //modifications are made in the same object
              //string buffer has a predefined size
              System.out.println(sb.capacity()); //16 chars when string buffer is empty
              //if we do string buffer("jas") -> capacity extends by 3 char i.e 19 
              //that means we always have extra 16 char space
              System.out.println(sb.length());
              //we can append any data we want
              sb.append(" Gandhi");
              System.out.println(sb);
              System.out.println(sb.capacity());//still 19

              //we can convert string buffer to string using to_string
              String s = sb.toString();
              System.out.println(s);

              //many methods exist in string buffer
              sb.insert(0 , "java");
              System.out.println(sb);
              
              sb.setLength(30);
              System.out.println(sb.length()); //30
              System.out.println(sb.capacity()); //40
              //increase capacity using this formula
              //new capacity = (old capacity * 2) + 2


              //string builder and string buffer are both same in working but has only one different
              //string buffer is thread safe and string builder is not thread safe
       }
}
