package dmitry.sokolov.classwork.Task3Fabrick;

public class Main {
    public static void main(String[] args) {
        Fabrick[] fabricks = {
                new Fabrick("VAZ", 100),
                new Fabrick("GAZ", 220),
                new Fabrick("FAS", 200)
        };
        var result = findFabrickWithMoreEmployee(fabricks);
        result.print();
    }
    private static Fabrick findFabrickWithMoreEmployee(Fabrick[] fabricks) {
        if (fabricks == null || fabricks.length == 0) {
            return null;
        }
        var result = fabricks[0];
        for (var fabrick :
                fabricks) {
            if (fabrick.getEmployeeCount() > result.getEmployeeCount()) {
                result = fabrick;
            }
        }
        return result;
    }
}

