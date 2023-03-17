package homework;

public class Manager implements Employee{

    private String fullName;
    private String department;
    private int salary;
    private String[] subordinates;

    public Manager(String fullName, String department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String department() {
        return department;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public String[] getSubordinates() {
        return subordinates;
    }

    public void getInfo() {
        System.out.println("Имя: " + fullName);
        System.out.println("Название департамента: " + department);
        System.out.println("Зарплата: " + salary);
        System.out.println();
    }
}
