import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main wordCount = new Main();
        wordCount.run();
    }

    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();

        if (sentence.equals(" ")) {
            System.out.println(0);
            return;
        }

        int count = calcCount(sentence);

        System.out.println(count);
    }

    public int calcCount(String sentence) {
        String[] words = sentence.trim().split(" ");

        return words.length;
    }
}
