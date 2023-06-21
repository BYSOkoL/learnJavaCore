package dmitry.sokolov.homework.fourth.Task7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task7\\INPUT");
        int number;
        while ((number = file.read()) != -1) {
            System.out.print((char) number);
        }
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task7\\INPUT"))) {
            String buffRead;
            while ((buffRead = reader.readLine()) != null) {
                strings.add(buffRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task7\\OUTPUT"))) {
            for (int i = strings.size() - 1; i > -1; i--) {
                buffWriter.write(strings.get(i) + "\r\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        }
    }
}
