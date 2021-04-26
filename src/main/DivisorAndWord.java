public class DivisorAndWord {
    private final int divisor;
    private final String word;

    public DivisorAndWord(int divisor, String word) {
        this.divisor = divisor;
        this.word = word;
    }

    public boolean isDivisibleBy(int number) {
        return number % divisor == 0;
    }

    public String wordIfDivisibleOrEmpty(int number) {
        if (isDivisibleBy(number)) return word;
        return "";
    }
}
