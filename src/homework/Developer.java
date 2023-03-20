package homework;

public class Developer implements Employee{

    private String fullName;
    private String department;
    private int salary;
    private String programmingLanguage;

    public Developer(String fullName, String department, int salary, String programmingLanguage) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getInfo() {
        return  "Имя: " + fullName + "\nНазвание департамента: " + department + "\nЗарплата: " + salary + "\n";
    }
}
