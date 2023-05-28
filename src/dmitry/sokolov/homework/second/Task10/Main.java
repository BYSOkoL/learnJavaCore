package dmitry.sokolov.homework.second.Task10;

public class Main {
    public static void main(String[] args) {
        Box10 box = new Box10(1);
        Box10 box2 = new Box10(1,3);
        Box10 box3 = new Box10(1, 3 ,5);
        System.out.println(box.getBoxType());
        System.out.println(box2.getBoxType());
        System.out.println(box3.getBoxType());

    }
}
