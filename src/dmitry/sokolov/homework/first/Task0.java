package dmitry.sokolov.homework.first;

public class Task0 {
    public static void main(String[] args) {


        int a = 1; //Длина первого
        int b = 6; //Ширина первого
        int c = 1; //Длина второго
        int d = 1; //Ширина второго
        int e = 5; //Длина участка
        int f = 6; //Ширина участка

        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("Можно построить");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("Можно построить");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("Можно построить");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("Можно построить");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("Можно построить");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("Можно построить");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("Можно построить");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("Можно построить");
        } else {
            System.out.println("Нельзя построить");
        }
    }
}




