// Stream Summaries Example
import java.util.stream.IntStream;

public class StreamSummariesExample {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);

        // Sum
        int sum = stream.sum();
        System.out.println("Sum: " + sum); // Outputs: 15

        // Max
        IntStream maxStream = IntStream.of(1, 2, 3, 4, 5);
        int max = maxStream.max().orElseThrow(); // Throws NoSuchElementException if stream is empty
        System.out.println("Max: " + max); // Outputs: 5

        // Min
        IntStream minStream = IntStream.of(1, 2, 3, 4, 5);
        int min = minStream.min().orElseThrow(); // Throws NoSuchElementException if stream is empty
        System.out.println("Min: " + min); // Outputs: 1

        // Average (Mean)
        IntStream meanStream = IntStream.of(1, 2, 3, 4, 5);
        double mean = meanStream.average().orElseThrow(); // Throws NoSuchElementException if stream is empty
        System.out.println("Mean: " + mean); // Outputs: 3.0
    }
}
