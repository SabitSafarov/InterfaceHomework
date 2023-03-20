package homework;

public class Manager implements Employee{

    private String fullName;
    private String department;
    private int salary;
    private String[] subordinates;

    public Manager(String fullName, String department, int salary, String[] subordinates) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.subordinates = subordinates;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public String[] getSubordinates() {
        return subordinates;
    }

    public String getInfo() {
        return  "Имя: " + fullName + "\nНазвание департамента: " + department + "\nЗарплата: " + salary + "\n";
    }
}
