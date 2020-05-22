import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/*
This code runs on Java 9 or above.
 */
public class FunctionalProgrammingRunner {

    public static void main(String args[]) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");


        printBasic(list);
        printWithFP(list);
        printWithFPWithFiltering(list);

        List<Integer> numbers = List.of(1,4,7,9);

        calculateSumWithFP(numbers);
        computeSquaresUsingMap();
        FPInternals();
        MethodReferencesRunner.methodReferenceRunner();

        Predicate<? super Integer> evenPredicate = number -> number % 2 == 0;
        Predicate<? super Integer> oddPredicate = number -> number % 2 == 1;


    }

    private static void FPInternals() {
        // Writing with Predicate
        System.out.println("FUNCTIONAL PROGRAMMING INTERNALS");
        System.out.println("  Without predicate and consumer ");
        List.of(23,43, 34, 45, 36,48).stream()
                .filter(n -> n%2 == 0)
                .forEach(e -> System.out.println(e));

        System.out.println("  PREDICATE ");
        // The above code can also be written as
        List.of(23,43, 34, 45, 36,48).stream()
                .filter(new EvenNumberPredicate())
                .forEach(e -> System.out.println(e));

        // Writing with consumer
        // The same code can also be written as
        System.out.println("  CONSUMER ");
        List.of(23,43, 34, 45, 36,48).stream()
                .filter(new EvenNumberPredicate())
                .forEach(new SystemOutConsumer());

        //Writing the MAP
        System.out.println(" MAP - FUNCTION INTERFACE ");
        List.of(23,43, 34, 45, 36,48).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SystemOutConsumer());

        System.out.println("----------------------------");
    }

    private static void computeSquaresUsingMap() {
        System.out.println("CALCULATE SQUARES WITH FUNCTIONAL PROGRAMMING - USING MAP");
        IntStream.range(1,11)
                .map(e -> e*e)
                .forEach(p-> System.out.println(p));
        System.out.println("----------------------------");
    }

    private static void calculateSumWithFP(List<Integer> numbers) {
        System.out.println("CALCULATE SUM WITH FUNCTIONAL PROGRAMMING - USING REDUCE");
        System.out.println("The numbers are :");
        numbers.stream().forEach(
                element -> System.out.print(element+ " ")
        );
        //Sum of numbers in the list.
        int sum = numbers.stream().reduce(
                0,
                (number1, number2) -> number1 +number2
        );
        System.out.println();
        System.out.println("Sum is : "+sum);
        //Sum of odd numbers in the list.
        int oddSum = numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(
                        0,
                        (number1, number2) -> (number1 + number2)
                );

        System.out.println("Sum of Odd numbers " +oddSum);
        System.out.println("----------------------------");
    }

    private static void printBasic(List<String> list) {
        System.out.println("PRINT WITH BASIC - NO FUNCTIONAL PROGRAMMING");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("----------------------------");
    }

    private static void printWithFP(List<String> list) {
        System.out.println("PRINT WITH FUNCTIONAL PROGRAMMING");
        list.stream().forEach(
                element -> System.out.println(element)
        );
        System.out.println("----------------------------");
    }

    private static void printWithFPWithFiltering(List<String> list) {
        System.out.println("PRINT WITH FUNCTIONAL PROGRAMMING FILTERING");
        // Printing elements ending with 'at'
        list.stream()
                .filter(
                        element -> element.endsWith("at")
                )
                .forEach(
                        element -> System.out.println(element)
                );
        System.out.println("----------------------------");
    }
}
