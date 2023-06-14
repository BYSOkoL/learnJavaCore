package dmitry.sokolov.classwork.lection11;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Les11 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("You entered string: ");
//        System.out.println(in.nextLine());
//        System.out.println("You entered integer: ");
//        System.out.println(in.nextInt());


//        Scanner in = new Scanner(System.in);
//        while (true) {
//            System.out.println("You entered int:");
//            if (in.hasNext()) {
//                System.out.println("Done");
//                break;
//            } else {
//                in.next();
//            }
//        }
//        in.close();


//        try (BufferedReader reader = new BufferedReader( new InputStreamReader( new FileInputStream("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\classwork\\lection11\\text2"),
//                StandardCharsets.UTF_8))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try( BufferedWriter br = new BufferedWriter( new FileWriter("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\classwork\\lection11\\text2"))) {
            br.write("data");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

}
