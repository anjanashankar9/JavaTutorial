import java.util.function.Consumer;

class SystemOutConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }

}
