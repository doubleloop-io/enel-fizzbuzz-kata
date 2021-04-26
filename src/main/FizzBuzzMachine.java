import java.util.stream.IntStream;

public class FizzBuzzMachine {

    private final DivisorAndWord[] divisorAndWords;

    public FizzBuzzMachine() {
        divisorAndWords = new DivisorAndWord[] {
                new DivisorAndWord(3, "Fizz"),
                new DivisorAndWord(5, "Buzz")
        };
    }

    public String say(int number) {
        String result = "";
        for (DivisorAndWord divisorAndWord : divisorAndWords) {
            result += divisorAndWord.wordIfDivisibleOrEmpty(number);
        }
        if (!result.isEmpty()) return result;
        return Integer.toString(number);
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

        public boolean isDivisibleBy(int number) {
            return number % divisor == 0;
        }

        private String wordIfDivisibleOrEmpty(int number) {
            if (isDivisibleBy(number)) return word;
            return "";
        }
    }
}
