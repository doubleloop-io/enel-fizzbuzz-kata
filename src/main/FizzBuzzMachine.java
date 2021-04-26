import java.util.stream.IntStream;

public class FizzBuzzMachine {
    public String say(int number) {
        String result = "";
        if (number % 3 == 0 && number % 5 == 0) return "Fizz" + "Buzz";
        if (number % 3 == 0) {
            result += "Fizz";
            return "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
            return "Buzz";
        }
        if (!result.isEmpty()) return result;
        return Integer.toString(number);
    }

    public String[] say(int from, int count) {
        return IntStream.range(from, from + count)
                .mapToObj(this::say)
                .toArray(String[]::new);
    }
}
