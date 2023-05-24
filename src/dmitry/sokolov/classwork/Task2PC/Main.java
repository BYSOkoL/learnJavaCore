package dmitry.sokolov.classwork.Task2PC;

public class Main {
    public static void main(String[] args) {
        PC[] pcs = {
                new PC("Intel", 32, 1000, 3),
                new PC("AMD", 8, 500, 1),
                new PC("Intel", 16, 256, 2)
        };
        var result = findPcGreatestHdd(pcs);
            result.print();
    }
    private static PC findPcGreatestHdd(PC[] pcs) {
        if (pcs == null || pcs.length == 0) {
            return null;
        }
        var result = pcs[0];
        for (var pc :
                pcs) {
            if (pc.getHddSize() > result.getHddSize()) {
                result = pc;
            }
        }
        return result;
    }
}

