package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEightFeaturesInColln {

    public static void main(String[] args){


        // 1. foreach(): to iterate over collection
        List<String> fruits = Arrays.asList("Apple","Banana","Mango");

        // lambda
        fruits.forEach(fruit -> System.out.println(fruit));
        // use method reference
        fruits.forEach(System.out::println);



        // 2. stream API with filter()
        System.out.println("Stream API");
        List<String > names = Arrays.asList("Dev", "Harsh", "Adit", "Devansh");
        // use of stream api
        names.stream()
                .filter(name -> name.startsWith("D"))
                .forEach(System.out::println);


        // 3. map() function nad collect()
        System.out.println("Map function");
        // transform data
        List<String> uppercaseList = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(uppercaseList);

        // using method reference
        List<String>  uppercaseList2 = names.stream()
                        .map(String::toUpperCase)
                                .collect(Collectors.toList());
        System.out.println(uppercaseList2);



        // 4. sorted()
        System.out.println("Sorting numbers using stream");
        List<Integer> numbers = Arrays.asList(1,4,5,3,2,8,7,1,3);
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList()); // also use .toList() directlly

        System.out.println(sortedList);

        // 5. distinct() to remove duplicate
        List<Integer> uniqueList = numbers.stream()
                .distinct()
                .toList();
        System.out.println(uniqueList);

        // 6. limit() and skip()
        System.out.println("Use limit and skip methods:");
        List<Integer> limited = numbers.stream()
                .skip(1)
                .limit(3)
                .toList();
        System.out.println(limited);

        // 7. anyMatch(), allMatch(), noneMatch()
        boolean anyStartedWithD = names.stream()
                .anyMatch(name -> name.startsWith("D"));
        System.out.println("Is this any name which started with D letter? : " + anyStartedWithD);



    }
}
