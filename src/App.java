import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers = { 3, 1, 2 };
        int[] sorted = sortNumbers(numbers);
        System.out.println("Posortowane liczby: " + Arrays.toString(sorted));
    }

    public static int[] sortNumbers(int[] input) {
        int[] copy = Arrays.copyOf(input, input.length);
        Arrays.sort(copy);
        return copy;
    }
}