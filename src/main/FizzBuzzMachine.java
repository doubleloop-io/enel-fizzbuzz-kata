import java.util.stream.IntStream;

public class FizzBuzzMachine {
    public String say(int number) {
        String result = "";
        int divisor1 = 3;
        String word1 = "Fizz";
        int divisor2 = 5;
        String word2 = "Buzz";
        if (isDivisibleBy(number, divisor1)) result += word1;
        if (isDivisibleBy(number, divisor2)) result += word2;
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
}
