package homework;

public class Designer implements Employee{

    private String fullName;
    private String department;
    private int salary;
    private String designSpecialization;

    public Designer(String fullName, String department, int salary, String designSpecialization) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.designSpecialization = designSpecialization;
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

    public String getDesignSpecialization() {
        return designSpecialization;
    }

    public String getInfo() {
        return  "Имя: " + fullName + "\nНазвание департамента: " + department + "\nЗарплата: " + salary + "\n";
    }
}
