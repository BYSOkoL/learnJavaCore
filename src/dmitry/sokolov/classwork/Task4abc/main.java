package dmitry.sokolov.classwork.Task4abc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    private static final String ABC = "abc";
    private static final String WWW = "www";
    private static final String ZZZ = "zzz";

    public static void main(String[] args) {

        var inputData = "   123123123";
        if (inputData.startsWith(ABC)) {
            inputData = WWW + inputData.substring(3);
        } else {
            inputData += ZZZ;
        }
        System.out.println(inputData);
    }
}
