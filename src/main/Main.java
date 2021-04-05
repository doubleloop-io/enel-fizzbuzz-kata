public class Main {
    public static void main(String[] args) {
        FizzBuzzMachine fizzBuzz = new FizzBuzzMachine();

        for (String fizzBuzzed : fizzBuzz.say(1, 100)) {
            System.out.println(fizzBuzzed);
        }
    }
}
