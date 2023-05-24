package dmitry.sokolov.test;

import dmitry.sokolov.homework.second.Task1.WeekDay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
      int number = WeekDay.valueOf("THURSDAY").getDayNumber();
        System.out.println(number);
        System.out.println(WeekDay.getNameByNumber(6));

        Student Alex = new Student(University.BGU, "Alex");
        Student Dmitry = new Student(University.BSEU, "Dmitry");
        Student Elena = new Student(University.BSUIR, "Elena");

        String demo = "I am demo string";
        System.out.println(demo.matches("^\\D*\\s(demo\\s?){3}\\D*$"));

        Pattern p = Pattern.compile(".*- +");
        Matcher matcher = p.matcher("Test - string - test");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
        }


    }
}
