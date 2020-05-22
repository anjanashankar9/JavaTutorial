import java.util.function.Function;

class NumberSquareMapper implements Function<Integer, Integer> {


    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}
