package Java8Features;

import java.util.Arrays;
import java.util.List;

public class JavaEightFeature {

    /* 1. Lambda expressions */
    // syntax: (parameter) -> { body }
    // Enables writing anonymous methods (functions) in a concise way.

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Dev", "Harsh", "Devang", "Mohit");
        names.forEach(name -> System.out.println(name));
        // with replace with forEach(System.out::println) called method reference
    }


    /* ✅ 2. Functional Interfaces */
    // An interface with only one abstract method (SAM - Single Abstract Method).
    @FunctionalInterface
    interface MyFunctionalInterface {
        void display();
    }

/*    public static void main(String[] args) {
        MyFunctionalInterface f = () -> System.out.println("Hello from lambda!");
        f.display();
    }*/


    /* ✅ 3. Default and Static Methods in Interface */
    // Interfaces can have method implementations using default or static.
/*    interface MyInterface {
        default void greet() {
            System.out.println("Hello from default method");
        }

        static void info() {
            System.out.println("Static method in interface");
        }
    }

    class MyClass implements MyInterface {
    }

    public static void main(String[] args) {
        new MyClass().greet();     // Default method
        MyInterface.info();        // Static method
    }*/




    /*✅ 4. Method References
        🔹 Description:
        Shortcut for calling a method via a reference to an existing method.

        🔹 Types:
        Static method reference — ClassName::staticMethod

        Instance method reference — object::instanceMethod

        Constructor reference — ClassName::new*/

//    List<String> names = Arrays.asList("Dev", "Raj", "Kiran");
//    names.forEach(System.out::println);  // Method reference



    /*✅ 5. Stream API
        🔹 Description:
        Used to process collections in a functional style (filter, map, reduce).*/

//    List<String> names = Arrays.asList("Dev", "Raj", "Kiran");
//names.stream()
//        .filter(name -> name.startsWith("D"))
//            .forEach(System.out::println);


    /*✅ 6. Optional Class
        🔹 Description:
        Helps to avoid NullPointerException.*/

//    Optional<String> name = Optional.ofNullable(null);
//System.out.println(name.orElse("Default Name"));  // Prints "Default Name"



    /*✅ 7. Date and Time API (java.time package)
        🔹 Description:
        Improved date/time classes, immutable and thread-safe.*/

//    LocalDate date = LocalDate.now();
//    LocalTime time = LocalTime.now();
//    LocalDateTime dateTime = LocalDateTime.now();
//
//System.out.println(date);      // 2025-06-30
//System.out.println(time);      // 12:30:45.123
//System.out.println(dateTime);  // 2025-06-30T12:30:45.123


    /*✅ 8. Collectors (Terminal operation in Stream)
        🔹 Description:
        Used to collect the result of a stream pipeline into a list, set, map, etc.*/

//    List<String> names = Arrays.asList("Dev", "Raj", "Kiran");
//    List<String> filtered = names.stream()
//            .filter(n -> n.startsWith("K"))
//            .collect(Collectors.toList());
//System.out.println(filtered);


    /*✅ 9. ForEach (Stream operation)
        🔹 Description:
        Used to iterate through elements in a collection.*/

//    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
//nums.forEach(n -> System.out.println(n));

}
