package dmitry.sokolov.homework.second.Task1;

public enum WeekDay {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private final int dayNumber;
    WeekDay(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }
    public static String getNameByNumber (int dayNumber) {
        for (WeekDay weekDay :
             WeekDay.values()) {
            if (weekDay.dayNumber == dayNumber) {
                return weekDay.name();
            }
        }
        return null;
    }
}
