package dmitry.sokolov.classwork.Task4abc;

import java.util.regex.Pattern;

public class Chetire {
    public static void main(String[] args) {
        var inputString = "12321 cv321 dsf32 sdff6 sdf4";
        var pattern = Pattern.compile("\\w");
        var matcher = pattern.matcher(inputString);

            String longestWord = null;
            int longestWordStart = 0;
            int longestWordEnd = 0;
            String shortestWord = null;
            int shortestWordStart = 0;
            int shortestWordEnd = 0;

            while (matcher.find()) {
                int length = matcher.end() - matcher.start();
                if (longestWord == null || longestWord.length() < length) {
                    longestWord = inputString.substring(matcher.start(), matcher.end());
                    longestWordStart = matcher.start();
                    longestWordEnd = matcher.end();
                }
                if (shortestWord == null || shortestWord.length() >= length) {
                    shortestWord = inputString.substring(matcher.start(), matcher.end());
                    shortestWordStart = matcher.start();
                    shortestWordEnd = matcher.end();

                }
            }

    }
}
