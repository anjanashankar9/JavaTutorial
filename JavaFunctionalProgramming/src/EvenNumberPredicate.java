import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test (Integer number) {
        return number % 2 == 0;
    }
}