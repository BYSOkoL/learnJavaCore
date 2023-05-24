package dmitry.sokolov.homework.second.Task1;

public class Main {
    public static void main(String[] args) {

        int number = WeekDay.valueOf("SATURDAY").getDayNumber();
        System.out.println(number);
        System.out.println(WeekDay.getNameByNumber(6));
    }
}
