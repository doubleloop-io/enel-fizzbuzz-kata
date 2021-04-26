import java.util.stream.IntStream;

public class FizzBuzzMachine {
    public String say(int number) {
        String result = "";
        DivisorAndWord divisorAndWord1 = new DivisorAndWord(3, "Fizz");
        DivisorAndWord divisorAndWord2 = new DivisorAndWord(5, "Buzz");
        if (isDivisibleBy(number, divisorAndWord1.divisor)) result += divisorAndWord1.word;
        if (isDivisibleBy(number, divisorAndWord2.divisor)) result += divisorAndWord2.word;
        if (!result.isEmpty()) return result;
        return Integer.toString(number);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public String[] say(int from, int count) {
        return IntStream.range(from, from + count)
                .mapToObj(this::say)
                .toArray(String[]::new);
    }

    public class DivisorAndWord {
        public int divisor;
        public String word;

        public DivisorAndWord(int divisor, String word) {
            this.divisor = divisor;
            this.word = word;
        }
    }
}
