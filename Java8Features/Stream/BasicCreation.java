package Java8Features.Stream;

import java.util.*;
import java.util.stream.Stream;

public class BasicCreation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> streamList = list.stream();

        String[] arr = {"Soham", "Swaraj", "Pratik"};
        Stream<String> stream = Arrays.stream(arr);

        stream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1,2,3);

        Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);

        Stream<Integer> limit1 = Stream.generate(() -> (int) Math.random() * 100).limit(1000);
    }
}
