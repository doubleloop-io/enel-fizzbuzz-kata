import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTests {
    FizzBuzzMachine machine;

    @BeforeEach
    void setUp() {
        machine = new FizzBuzzMachine(new DivisorAndWord[]{
                new DivisorAndWord(3, "Fizz"),
                new DivisorAndWord(5, "Buzz")
        });
    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void standardNumber(int number, String expected) {
        assertThat(machine.say(number)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 3 * 2})
    void sayFizz(int number) {
        assertThat(machine.say(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 5 * 2})
    void sayBuzz(int number) {
        assertThat(machine.say(number)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3 * 5, 2 * 3 * 5})
    void sayFizzBuzz(int number) {
        assertThat(machine.say(number)).isEqualTo("FizzBuzz");
    }

    @Test
    void sayManyNumbers() {
        assertThat(machine.say(1, 5)).isEqualTo(new String[]{"1", "2", "Fizz", "4", "Buzz"});
    }
}
