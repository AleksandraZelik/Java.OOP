package homework10;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Введіть речення: ");
            String sentence = sc.next();

            Map<Character, Integer> letterCounts = new HashMap<>();
            for (int i = 0; i < sentence.length(); i++) {
                char letter = sentence.charAt(i);
                letterCounts.put(letter, letterCounts.getOrDefault(letter, 0) + 1 );
            }
            System.out.println("Кількість кожної літери в реченні:");
            System.out.println(letterCounts);
            }
        }


