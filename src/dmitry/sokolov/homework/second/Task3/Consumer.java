package dmitry.sokolov.homework.second.Task3;

public class Consumer {
    int firstNumber;
    int secondNumber;
    int thirdNumber;
    int fourthNumber;
    int fifthNumber;

    public void Consume(int firstNumber1) {
        fifthNumber = fourthNumber;
        fourthNumber = thirdNumber;
        thirdNumber = secondNumber;
        secondNumber = firstNumber;
        this.firstNumber = firstNumber1;
    }

    public double avg() {
        double avg = (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber) / 5.0;
        return avg;
    }


}
