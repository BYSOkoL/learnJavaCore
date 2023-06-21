package dmitry.sokolov.homework.fourth.Task8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task8\\INPUT");
        int number;
        String buffRead;
        String buffRead2;

        while ((number = file.read()) != -1) {
            System.out.print((char) number);
        }
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task8\\INPUT"))) {
            while ((buffRead = reader.readLine()) != null) {
                strings.add(buffRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> strings2 = new ArrayList<>();
        try (BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task8\\INPUT2"))) {
            while ((buffRead2 = reader2.readLine()) != null) {
                strings2.add(buffRead2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> strings3 = new ArrayList<>();
        for (int i = strings2.size() - 1; i > -1; i--) {
                if (strings.contains(strings2.get(i))) {
                    strings3.add(strings2.get(i));
                }
            }
        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task8\\OUTPUT"))) {
            for (int i = strings3.size() - 1; i > -1; i--) {
                buffWriter.write(strings3.get(i) + "\r\n");
                    }
        } catch (
                IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        }
    }
}

