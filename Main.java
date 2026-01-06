import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
       public static void main(String[] args) {
              List<String> ls = new ArrayList<>();
              ls.add("jas");
              ls.add("riya");
              ls.add("null");
              Stream<String> stream1 = ls.stream(); // any change in stream1 will not affect the original list

              // stream has specific methods
              stream1.map(s -> s.concat("Hi")).sorted().forEach(System.out::println);

              String s2 = ls.stream().reduce("jas", (c, e) -> c + e); 
              //reduce combines everything in one value with a starting value 
              //for the abv ex it is jas
              //output will be jasjasriyanull

              System.out.println(s2);

              // stream1.forEach(System.out::println);

              // NOTE: a stream can only be used once
              // so we cant do
              // stream1.count(); or any other thing with stream1
              // stream1 is already closed

              // we have methods like
              // .filter -> can filter based on cond
              // .map -> can change all values in stream
              // .sorted -> sorts the elements
              // .distinct -> remove dups
              // .skip -> skip first n elements
       }
}
