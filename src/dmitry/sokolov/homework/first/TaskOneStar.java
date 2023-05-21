package dmitry.sokolov.homework.first;

public class TaskOneStar {
    public static void main(String[] args) {
        int array[] = {2, 0, 0, 3};
        int previousNumb = array[0];
        int previous2Numb = 0;
        int finishChoice = 0;
        for (int i = 1; i < array.length; i++) {
            int choice = array[i];
            if (i > 1)
                choice += previous2Numb;
            int nonChoice = 0 + previousNumb;
            if (choice >= nonChoice) {
                finishChoice = choice;
            } else {
                finishChoice = nonChoice;
            }
            previous2Numb = previousNumb;
            previousNumb = finishChoice;
        }
        System.out.println(previousNumb);

    }
}

