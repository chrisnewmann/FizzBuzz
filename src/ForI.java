public class ForI implements FizzBuzz{

    @Override
    public void print(int from, int to) {
        System.out.println("For loop with 'i'.");
        for (int i = from; i < to; i++) {
            Main.checkFizzBuzz(i);
        }
    }
}
