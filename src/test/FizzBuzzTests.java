import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTests {
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void standardNumber(int number, String expected) {
        assertThat(fizzBuzz(number)).isEqualTo(expected);
    }

    private String fizzBuzz(int number) {
        return Integer.toString(number);
    }
}
