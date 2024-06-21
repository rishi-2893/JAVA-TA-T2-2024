// Connecting a Stream to an External Source Example
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ExternalSourceStreamExample {
    public static void main(String[] args) {
        // Connecting a stream to read from standard input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> input = reader.lines();

        // Processing lines from standard input
        input.forEach(System.out::println);
    }
}
