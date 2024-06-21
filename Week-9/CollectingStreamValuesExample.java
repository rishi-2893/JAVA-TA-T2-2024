// Collecting Values from a Stream Example
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingStreamValuesExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        // Collecting stream elements into a List
        List<Integer> list = stream.collect(Collectors.toList());

        System.out.println("List of integers: " + list); // Outputs: [1, 2, 3, 4, 5]
    }
}
