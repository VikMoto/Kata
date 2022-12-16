package KataLevel1;
//In this kata you will create a function that takes a list of non-negative integers
// and strings and returns a new list with the strings filtered out.
//
//Example
//Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
//Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
//Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)

import java.util.List;
import java.util.stream.Collectors;

public class FilterIntegerFromList {
    public static List<Object> filterList(final List<Object> list) {

        return  list.stream()
                .filter(it -> it instanceof Integer)
                .peek(System.out::println)
                .collect(Collectors.toList());



//         return list.stream().filter(Integer.class::isInstance).toList();
//return (List) list.stream().filter(o -> !o.getClass().equals(String.class)).collect(java.util.stream.Collectors.toList());


    }

    public static void main(String[] args) {
        List<Object> inList = List.of(1, 2, "a", "b", "aasf", "1", "123", 231);
        System.out.println("filterList(inList) = " + filterList(inList));

    }
}
