package dmitry.sokolov.homework.second.Task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var inputText = "aqswsad  8888-2524-325-658723 sdfk;";
        Pattern p = Pattern.compile("(\\s[0-9]{4}.[0-9]{4}.[0-9]{4}.[0-9]{4}\\s)");
        Matcher matcher = p.matcher(inputText);
        if (matcher.find()) {
            System.out.println("I found" + matcher.group());
        } else {
            System.out.println("Not found");
        }
    }
}

