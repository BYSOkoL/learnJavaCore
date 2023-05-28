package dmitry.sokolov.homework.second.Task7;

public class Main {
    public static void main(String[] args) {
        String inputString = "   a123eeea eee aeeasdeea  asdasd 312dreee A324234gfeea";
        int countE = 0;
        var countWordsStartAndEndWithA = 0;
        String[] words = inputString.split(" ");
        for (var word :
                words) {
            if ((word.startsWith("a")) && (word.endsWith("a"))) {
                countWordsStartAndEndWithA++;
            }
        }
        System.out.println(countWordsStartAndEndWithA);
    }
}
