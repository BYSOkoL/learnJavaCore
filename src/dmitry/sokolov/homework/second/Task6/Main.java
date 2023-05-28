package dmitry.sokolov.homework.second.Task6;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        String inputString = "123 12345 12345678 1234567890 123 212";
        String[] words = inputString.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        System.out.println(longestWord);
    }
}