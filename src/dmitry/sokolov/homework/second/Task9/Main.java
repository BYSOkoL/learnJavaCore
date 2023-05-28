package dmitry.sokolov.homework.second.Task9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var inputText = " sdfk aqswsad find  8888-2524-3254-6587 sdfk;";
        Pattern p = Pattern.compile("(\\sfind\\s)");
        Matcher matcher = p.matcher(inputText);
        if (matcher.find()) {
            System.out.println("I found " + matcher.group() + "First sumbol index: " + matcher.start());
        } else {
            System.out.println("Not found");
        }
    }
}
