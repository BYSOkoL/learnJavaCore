public class Domashka1 {
    public static void main(String[] args) {

        int d0 = 5; //dlina uchastka
        int sh0 = 6; //shirina uchastka
        int d1 = 1; //Dlina pervogo
        int sh1 = 6; //SHirina pervogo
        int d2 = 1; //Dlina vtorogo
        int sh2 = 1; //SHirina vtorogo

        if ((d0 >= (d1 + d2)) && (sh0 >= sh1 && sh0 >= sh2)) {
            System.out.println("Can");
        } else if ((d0 >= (d1 + sh2)) && (sh0 >= sh1 && sh0 >= d2)) {
            System.out.println("Can");
        } else if ((d0 >= (sh1 + d2)) && (sh0 >= d1 && sh0 >= sh2)) {
            System.out.println("Can");
        } else if ((d0 >= (sh1 + sh2)) && (sh0 >= d1 && sh0 >= d2)) {
            System.out.println("Can");
        } else if ((sh0 >= (d1 + d2)) && (d0 >= sh1 && d0 >= sh2)) {
            System.out.println("Can");
        } else if ((sh0 >= (d1 + sh2)) && (d0 >= sh1 && d0 >= d2)) {
            System.out.println("Can");
        } else if ((sh0 >= (sh1 + d2)) && (d0 >= d1 && d0 >= sh2)) {
            System.out.println("Can");
        } else if ((sh0 >= (sh1 + sh2)) && (d0 >= d1 && d0 >= d2)) {
            System.out.println("Can");
        } else System.out.println("Нельзя построить 2 дома");
    }
}




