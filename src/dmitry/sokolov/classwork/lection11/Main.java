package dmitry.sokolov.classwork.lection11;

import java.io.*;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        Box box = new Box(1, 2, 4);
        box.setName("First Box");
        try (
                FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\classwork\\lection11\\example");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeInt(12345);
            oos.writeObject("Today");
            oos.writeObject(box);
        } catch (FileNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error2" + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\classwork\\lection11\\example");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            int i = ois.readInt();
            String today = (String) ois.readObject();
            Box date = (Box) ois.readObject();
            System.out.println(i);
            System.out.println(today);
            System.out.println(date);
        } catch (IOException e) {
            e.getStackTrace();
        } catch (ClassNotFoundException e) {
            e.getStackTrace();
        }
    }
}
