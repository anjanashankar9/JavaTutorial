import java.util.List;

class MethodReferencesRunner {

    public static void print(Integer number) {
        System.out.println(number);
    }

    public static void methodReferenceRunner (){
        //The reason for going for method reference is readability
        System.out.println("Method Reference Runner");
        System.out.println("The usual way :");
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
                .stream().map(s -> s.length())
                .forEach(s -> System.out.println(s));
        System.out.println(" ShortCut System out ");
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
                .stream().map(s -> s.length())
                .forEach(System.out::println);
        System.out.println(" Using Method Reference Print ");
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
                .stream().map(s -> s.length())
                .forEach(MethodReferencesRunner::print);
        System.out.println(" Using Method Reference for instance method ");
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
                .stream().map(String::length)
                .forEach(MethodReferencesRunner::print);
    }
}
