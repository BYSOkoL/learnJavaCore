package roman.lis.lection15;

import java.util.concurrent.locks.ReentrantLock;

class MyLock extends ReentrantLock {
    private final String name;

    public MyLock(String name) {
        super(true);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
