package dmitry.sokolov.homework.fourth.Task910;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task910 {
    private static final String BOXES = "C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task910\\boxes";
    private static final String BIGGEST_BOX = "C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\homework\\fourth\\Task910\\biggestBox";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(BOXES);
        ObjectOutputStream cos = new ObjectOutputStream(fos);
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(8, 23, 13));
        boxes.add(new Box(60, 25, 16));
        boxes.add(new Box(14, 10, 73));
        boxes.add(new Box(21, 67, 53));
        boxes.add(new Box(150, 150, 110));
        cos.writeObject(boxes);
        cos.close();
        FileInputStream fis = new FileInputStream(BOXES);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Box> box = (List<Box>) ois.readObject();
        ois.close();
        System.out.println(box);
        Box max = boxes.get(0);
        for (Box box1 : box) {
            if (max.getVolume() < box1.getVolume()) {
                max = box1;
                System.out.println(max);
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(BIGGEST_BOX);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(max);
        objectOutputStream.close();
    }
}
