package dmitry.sokolov.classwork.Task4abc;

public class Dva {
    public static void main(String[] args) {

        var invalidString = "   Hello    Java!   ";
        var validString = invalidString.trim();
        validString = validString.replaceAll("\\s{2,}" ," ");
        System.out.println("[" + validString + "]");
    }
}
