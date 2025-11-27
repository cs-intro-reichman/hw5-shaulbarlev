
import java.util.Dictionary;

public class testingJava {

    // Reads all words from dictionary filename into a String array.
    public static String[] readDictionary(String filename) {
        In in = new In(filename);
        return in.readAllLines();
    }

    
    public static void main(String[] args) {
        String[] dict = readDictionary("dictionary.txt");


        for (int i = 0; i < dict.length; i++) {
            System.out.println(dict[i]);
        }
    }
}
