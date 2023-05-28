package dmitry.sokolov.homework.second.Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputString = "  123eee eee eeasdee  asdasd 312dreee 324234gfee";
        int countE = 0;
        var countWordsWithManyE = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'e') {
                countE++;
            }
            if (inputString.charAt(i) == ' ') {
                if (countE >= 3)
                    countWordsWithManyE++;
                countE = 0;
            }
        }
        if (countE >= 3) {
            countWordsWithManyE++;
        }
        System.out.println(countWordsWithManyE);
    }
}

