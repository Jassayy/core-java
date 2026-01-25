import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // stream practice
        // List<Integer> list = Arrays.asList(2, 43, 54, 23, 1, 56);

        // stream 1
        /*
         * find even
         * square them
         * collect into a list
         * 
         */
        // list.stream()
        // .filter(i -> i % 2 == 0)
        // .map(i -> i * i)
        // .forEach(System.out::println);

        /*
         * From a List<String> names,
         * 
         * convert all names to uppercase
         * 
         * remove duplicates
         * 
         * sort alphabetically.
         */

        // List<String> l2 = Arrays.asList("Jas", "Jack", "Bro", "Jas", "Jack");

        // l2.stream()
        // .map(String::toUpperCase)
        // .distinct()
        // .sorted()
        // .forEach(System.out::println);

        /*
         * Given a List<Integer>,
         * 
         * find the sum of all numbers using streams
         * 
         * find the max number.
         */

        // List<Integer> list = Arrays.asList(13, 53, 65, 23, 88, 65, 69);

        // // convert to intstream -> sum() can be used for int streams only
        // int sum = list.stream()
        // .reduce(0, Integer::sum);

        // int sum1 = list.stream()
        // .mapToInt(Integer::intValue)
        // .sum();
        // //to get max -> convert to intstream using maptoint
        // int max = list.stream()
        // .mapToInt(Integer::intValue)
        // .max()
        // .getAsInt();

        // System.out.println(max);
        // System.out.println(sum + " " + sum1);

        // List<String> list = Arrays.asList("word", "bro", "Buddy", "OKay",
        // "BuddyBroi", "Whadaddcuk");

        // /*
        // * From a list of words,
        // *
        // * filter words whose length > 5
        // *
        // * collect them into a Set.
        // */

        // Set<String> st = list.stream()
        // .filter(s -> s.length() > 5)
        // .collect(Collectors.toSet());
        // System.out.println(st);

        /*
         * Count how many numbers are divisible by 3
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int i = (int) list.stream()
                .filter(a -> a % 3 == 0)
                .mapToInt(Integer::intValue)
                .count();

                System.out.println(i);

    }
}
