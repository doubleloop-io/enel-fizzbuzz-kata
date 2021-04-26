import java.util.stream.IntStream;

public class FizzBuzzMachine {
    public String say(int number) {
        DivisorAndWord[] divisorAndWords = new DivisorAndWord[] {
                new DivisorAndWord(3, "Fizz"),
                new DivisorAndWord(5, "Buzz")
        };



        String result = "";
        for (DivisorAndWord divisorAndWord : divisorAndWords) {
            if (isDivisibleBy(number, divisorAndWord.divisor)) result += divisorAndWord.word;
        }
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
