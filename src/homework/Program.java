package homework;

public class Program {
    public static void main(String[] args) {
        String[] arrayEmployees = {new Manager("John", "Отдел кадров", 120000, new String[]{"Alex", "Olga", "Roman"}).getInfo(),
                                   new Developer("Alex", "IT-отдел", 90000, "Java").getInfo(),
                                   new Designer("Olga", "Отдел рекламы", 80000, "Вэб-дизайнер").getInfo()};

        for (String employee : arrayEmployees) {
            System.out.println(employee);
        }

    }
}