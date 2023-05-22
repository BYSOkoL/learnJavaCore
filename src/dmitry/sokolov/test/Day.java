package dmitry.sokolov.test;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private final int dayNumber;
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }
    public static String getNameByNumber (int dayNumber) {
        for (Day day:
             Day.values()) {
            if (day.dayNumber == dayNumber) {
                return day.name();
            }
        }
        return null;
    }
}
