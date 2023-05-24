package dmitry.sokolov.classwork.Task3Fabrick;

public class Fabrick {
    private String name;
    private Integer employeeCount;

    public Fabrick(String name, Integer employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public void print() {
        System.out.printf("Name: %s, employeeCount: %s \n",
                name,
                employeeCount);
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }
}
