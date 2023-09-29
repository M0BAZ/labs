package lab3__2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 2500.0);
        Employee employee2 = new Employee("Петров Петр Петрович", 2800.0);
        Employee employee3 = new Employee("Сидоров Сидор Сидорович", 2300.0);

        Employee[] employees = {employee1, employee2, employee3};

        Report.generateReport(employees);
    }
}
