package lab3__2;

import java.text.DecimalFormat;

public class Report {
    public static void generateReport(Employee[] employees) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.println("Отчет о сотрудниках");
        System.out.println("-------------------");
        System.out.println("ФИО                  Зарплата");
        System.out.println("-------------------");

        for (Employee employee : employees) {
            System.out.printf("%-20s $%s%n", employee.getFullName(), decimalFormat.format(employee.getSalary()));
        }
    }
}
