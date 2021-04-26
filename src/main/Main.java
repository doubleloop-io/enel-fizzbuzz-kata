public class Main {
    public static void main(String[] args) {
        FizzBuzzMachine fizzBuzz = new FizzBuzzMachine(new DivisorAndWord[]{
                new DivisorAndWord(3, "Fizz"),
                new DivisorAndWord(5, "Buzz"),
                new DivisorAndWord(7, "Bang")
        });

        for (String fizzBuzzed : fizzBuzz.say(1, 100)) {
            System.out.println(fizzBuzzed);
        }
    }
}
