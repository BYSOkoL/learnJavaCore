package dmitry.sokolov.homework.second.Task3;

public class Main {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.Consume(1);
        System.out.println(consumer.firstNumber + " "
                + consumer.secondNumber + " "
                + consumer.thirdNumber + " "
                + consumer.fourthNumber + " "
                + consumer.fifthNumber);
        consumer.Consume(2);
        System.out.println(consumer.firstNumber + " "
                + consumer.secondNumber + " "
                + consumer.thirdNumber + " "
                + consumer.fourthNumber + " "
                + consumer.fifthNumber);
        consumer.Consume(3);
        System.out.println(consumer.firstNumber + " "
                + consumer.secondNumber + " "
                + consumer.thirdNumber + " "
                + consumer.fourthNumber + " "
                + consumer.fifthNumber);
        consumer.Consume(4);
        System.out.println(consumer.firstNumber + " "
                + consumer.secondNumber + " "
                + consumer.thirdNumber + " "
                + consumer.fourthNumber + " "
                + consumer.fifthNumber);
        consumer.Consume(5);
        System.out.println(consumer.firstNumber + " "
                + consumer.secondNumber + " "
                + consumer.thirdNumber + " "
                + consumer.fourthNumber + " "
                + consumer.fifthNumber);
        consumer.Consume(4);
        System.out.println(consumer.firstNumber + " "
                + consumer.secondNumber + " "
                + consumer.thirdNumber + " "
                + consumer.fourthNumber + " "
                + consumer.fifthNumber);
        System.out.println(consumer.avg());
    }

}
