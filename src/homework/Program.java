package homework;

public class Program {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "Отдел кадров", 120000);
        Developer developer = new Developer("Alex", "IT-отдел", 90000, "Java");
        Designer designer = new Designer("Olga", "Отдел рекламы", 80000, "Продуктовый дизайнер");

        Object[] arrayEmployees = {manager, developer, designer};

        for (Object employee : arrayEmployees) {

        }

    }
}