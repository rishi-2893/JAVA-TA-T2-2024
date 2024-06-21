// Working with Streams Example
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        // Creating a stream
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        // Processing stream elements
        stream.forEach(System.out::println);

        // Stream transformations
        Stream<Integer> transformedStream = Stream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 0) // Filtering even numbers
                .map(n -> n * n); // Mapping to their squares

        transformedStream.forEach(System.out::println); // Outputs: 4, 16

        // Reducing a stream to a result
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum); // Outputs: 15
    }
}
