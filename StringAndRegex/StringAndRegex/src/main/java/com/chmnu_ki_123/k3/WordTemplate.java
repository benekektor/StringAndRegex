import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordTemplate {
    public static String filterWords(String[] words, String pattern) {
        List<String> filteredWords = Arrays.stream(words)
                .filter(word -> !word.matches(pattern)) // Exclude words matching the pattern
                .collect(Collectors.toList());

        return String.join(" ", filteredWords);
    }

    public static void main(String[] args) {
        String[] words = {"book", "car", "sun", "paper", "tree"};
        String pattern = "^s.*";  // Exclude words that start with 's'

        String result = filterWords(words, pattern);
        System.out.println("Filtered words: " + result);
    }
}
