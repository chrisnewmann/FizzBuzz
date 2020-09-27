import java.util.stream.IntStream;

public class Main implements FizzBuzz {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("For each loop");

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15};
        for (int n : nums) {
            checkFizzBuzz(n);
        }
        System.out.println();
        System.out.println("Stream");

        FizzBuzz fizzBuzz = new Streamm();
        fizzBuzz.print(0, 30);

        }
        public static void checkFizzBuzz(int value){
            if (value % 15 == 0) {
                System.out.println(value + " FizzBuzz");
            } else if (value % 3 == 0) {
                System.out.println(value + " Fizz");
            } else if (value % 5 == 0) {
                System.out.println(value + " Buzz");
            }
        }

    @Override
    public void print(int from, int to) {
        System.out.println("For loop with 'i'.");
        for (int i = from; i < to; i++) {
            checkFizzBuzz(i);
        }
    }
}
