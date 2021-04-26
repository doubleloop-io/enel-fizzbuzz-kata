import java.util.stream.IntStream;

public class FizzBuzzMachine {
    public String say(int number) {
        String result = "";
        if (isDivisibleBy(number, 3)) result += "Fizz";
        if (isDivisibleBy(number, 5)) result += "Buzz";
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
