package dmitry.sokolov.classwork.Task4abc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tri {
    public static void main(String[] args) {
        var text = "12321cv321dsf32sdff6sdf4";
        var pattern = Pattern.compile("\\d+");
        var matcher = pattern.matcher(text);
        Integer result = null;
        while   (matcher.find()) {
            int length = matcher.end() - matcher.start();
            if (result == null || length > result) {
                result = length;
            }
        }
        if (result == null)
        {
            System.out.println("NO");
        } else {
            System.out.println("longest:" + result);
        }
    }
}
