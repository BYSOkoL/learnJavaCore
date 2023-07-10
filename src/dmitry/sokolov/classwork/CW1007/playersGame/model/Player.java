package dmitry.sokolov.classwork.CW1007.playersGame.model;

import java.io.Serializable;

public class Player implements Serializable {
    private static final String STRING_TEMPLATE = "Player age : %s, name: %s, active %s";
    private final String name;
    private final int age;
    private final boolean active;

    public Player(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }
    @Override
    public String toString() {
        return String.format(STRING_TEMPLATE, age, name, active);
    }
}
