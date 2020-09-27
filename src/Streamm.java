import java.util.stream.IntStream;

public class Streamm implements FizzBuzz {
    @Override
    public void print(int from, int to) {

        IntStream ints = IntStream.rangeClosed(from, to);
        ints.filter(n -> n % 15 == 0)
                .forEach(System.out::println);
    }
}
