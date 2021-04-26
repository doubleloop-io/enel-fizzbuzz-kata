import java.util.stream.IntStream;

public class FizzBuzzMachine {

    private final DivisorAndWord[] divisorAndWords;

    public FizzBuzzMachine(DivisorAndWord[] divisorAndWords) {
        this.divisorAndWords = divisorAndWords;
    }

    public String say(int number) {
        String result = "";
        for (DivisorAndWord divisorAndWord : divisorAndWords)
            result += divisorAndWord.wordIfDivisibleOrEmpty(number);
        if (!result.isEmpty()) return result;
        return Integer.toString(number);
    }

    public String[] say(int from, int count) {
        return IntStream.range(from, from + count)
                .mapToObj(this::say)
                .toArray(String[]::new);
    }
}
