import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
    private BST bst;

    public Dictionary(String filename) {
        bst = new BST();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                String key = parts[0].trim();
                String value = parts[1].trim();
                bst.insert(key, value);
               
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String translateSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            String translation = bst.find(word.toLowerCase());
            if (translation == null) {
                sb.append("--not--found--").append(" ");
            } else {
                sb.append(translation).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
