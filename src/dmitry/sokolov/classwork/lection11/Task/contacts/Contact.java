package roman.lis.phone.contacts;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private final Set<String> work = new HashSet<>();
    private final Set<String> normal = new HashSet<>();
    private final String name;

    public Contact(String name) {
        this.name = name;
    }

    public void addNumber(NumberType type, String number) {
        if (type == NumberType.NORMAL) {
            normal.add(number);
        } else {
            work.add(number);
        }
    }

    public void removeNumber(NumberType type, String number) {
        if (type == NumberType.NORMAL) {
            normal.remove(number);
        } else {
            work.remove(number);
        }
    }
    public void changeNumber(NumberType type,
                             String oldNumber,
                             String newNumber) {
        if (type == NumberType.NORMAL) {
            changeNumber(normal, oldNumber, newNumber);
        } else {
            changeNumber(work, oldNumber, newNumber);
        }

    }

    public String getName() {
        return name;
    }

    private void changeNumber(Set<String> numbers,
                              String oldNumber,
                              String newNumber) {
        numbers.add(newNumber);
        numbers.remove(oldNumber);
    }
}