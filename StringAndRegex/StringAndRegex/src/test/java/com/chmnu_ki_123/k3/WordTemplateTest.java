import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTemplateTest {

    @Test
    public void testFilterWords() {

        String[] words = {"book", "car", "sun", "paper", "tree"};
        String pattern = "^s.*";

        String result = WordTemplate.filterWords(words, pattern);

        System.out.println("Filtered output: " + result);

        assertEquals("book car paper tree", result);
    }
}
