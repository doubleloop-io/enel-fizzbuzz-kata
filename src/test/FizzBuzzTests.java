import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTests {
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void standardNumber(int number, String expected) {
        assertThat(fizzBuzz(number)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 3 * 2})
    void sayFizz(int number) {
        assertThat(fizzBuzz(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 5 * 2})
    void sayBuzz(int number) {
        assertThat(fizzBuzz(number)).isEqualTo("Buzz");
    }

    private String fizzBuzz(int number) {
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return Integer.toString(number);
    }
}
