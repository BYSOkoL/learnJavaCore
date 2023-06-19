package dmitry.sokolov.classwork.lection11.Task.contacts;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private final Set<String> work;
    private final Set<String> normal;
    private final String name;

    public Contact(String name) {
        this.name = name;
        work = new HashSet<>();
        normal = new HashSet<>();
    }
    public Contact(Contact contact) {
        this.name = contact.name;
        this.work = contact.work;
        this.normal = contact.normal;
    }


    public void addNumber(NumberType type, String number) {
        if (type == NumberType.NORMAL) {
            normal.add(number);
        } else {
            work.add(number);
        }
    }

    public boolean removeNumber(NumberType type, String number) {
        if (type == NumberType.NORMAL) {
            return normal.remove(number);
        } else {
            return work.remove(number);
        }
    }
    public boolean changeNumber(NumberType type,
                             String oldNumber,
                             String newNumber) {
        if (type == NumberType.NORMAL) {
            return changeNumber(normal, oldNumber, newNumber);
        } else {
            return changeNumber(work, oldNumber, newNumber);
        }
    }

    public String getName() {
        return name;
    }

    private boolean changeNumber(Set<String> numbers,
                              String oldNumber,
                              String newNumber) {
        numbers.add(newNumber);
        return numbers.remove(oldNumber);
    }

    public boolean isNumberExist (NumberType type, String number) {
        if (type == NumberType.WORK) {
            return normal.contains(number);
        }
        return  work.contains(number);
    }

}