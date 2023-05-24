package dmitry.sokolov;

public enum Day1 {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private final int dayNumber;
    Day1(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }
    public static String getNameByNumber (int dayNumber) {
        for (Day1 day:
             Day1.values()) {
            if (day.dayNumber == dayNumber) {
                return day.name();
            }
        }
        return null;
    }
}
