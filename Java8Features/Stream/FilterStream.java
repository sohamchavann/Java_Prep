package Java8Features.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,5,6,7,8,0,1,2,3,4);

        //filter
        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(toList());

        System.out.println(filteredList);

        //map
        List<Integer> mapppedList = filteredList.stream().map(x -> x/2).collect(toList());
        System.out.println(mapppedList);

        //distinct
        List<Integer> compList = list.stream().filter(x -> x % 2 == 0).map(x -> x/2).distinct().collect(toList());
        System.out.println(compList);

        //sorted
        List<Integer> sortedList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted()
                .collect(toList());
        System.out.println(sortedList);


        //sorted using comparator
        List<Integer> sorted1List = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted((a, b) -> b - a)
                .collect(toList());
        System.out.println(sorted1List);

        //Limit, Skip and peek
        List<Integer> natNums = Stream
                .iterate(1 , x -> x + 1)
                .limit(100)
                .map(x -> x/10)
                .skip(1)
                .distinct()
                .peek(x -> System.out.print(x +" "))
                .collect(toList());

        //terminal ops: count, min, max
        Integer count = Stream
                .iterate(1 , x -> x + 1)
                .limit(10)
                .peek(x -> System.out.print(x +" "))
                .max((a, b) -> b-a).get();
//                .count();
        System.out.println(count);


        //parallel stream : used for divding stream into multiple streams (threads)
        //can be use if list is large
        List<Integer> list4 = Arrays.asList(1,2,3,4,5);
        list4.parallelStream();
    }
}
