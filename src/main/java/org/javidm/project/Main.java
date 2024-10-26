import java.util.Arrays;

public class Main {
            public static void main(String[] args) {
                EmployeeBook employeeBook = new EmployeeBook(10);

                // Add some employees for testing
                employeeBook.addEmployee("Тимур Березин Иванович", 1, 54321);
                employeeBook.addEmployee("Егор Окулов Петрович", 2, 65432);
                employeeBook.addEmployee("Денис Семенов Сидорович", 3, 45678);
                employeeBook.addEmployee("Артём Лукьянов Николаевич", 4, 56789);
                employeeBook.addEmployee("Марк Ерофеев Сергеевич", 5, 76543);
                employeeBook.addEmployee("Арсений Григорьев Александрович", 1, 43219);
                employeeBook.addEmployee("Пётр Власов Борисович", 2, 65432);
                employeeBook.addEmployee("Михаил Морозов Дмитриевич", 3, 44321);
                employeeBook.addEmployee("Лев Анисимов Дмитриевич", 4, 56666);
                employeeBook.addEmployee("Кирилл Ефремов Егорович", 5, 47770);

                System.out.println("Список всех сотрудников:");
                employeeBook.printAllEmployees();

                System.out.println("\nСумма затрат на ЗП в месяц: " + employeeBook.calculateTotalSalary());
                System.out.println("Сотрудник с минимальной ЗП: " + employeeBook.findEmployeeWithMinSalary());
                System.out.println("Сотрудник с максимальной ЗП: " + employeeBook.findEmployeeWithMaxSalary());
                System.out.println("Среднее значение зарплат: " + employeeBook.calculateAverageSalary());

                System.out.println("\nФИО всех сотрудников:");
                employeeBook.printAllEmployeeNames();
            }
}