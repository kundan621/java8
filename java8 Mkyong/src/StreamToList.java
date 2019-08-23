import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream to List in local
 */
public class StreamToList {

    public static void main(String args[]) {
        Stream<String> language = Stream.of("java", "python", "node");
        List<String> list=language.collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
