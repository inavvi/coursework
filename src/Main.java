public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.addEmployee("Иванов", "Иван", "Иванович", 1, 70000);
        employee.addEmployee("Петров", "Иван", "Иванович", 2, 72000);
        employee.addEmployee("Сидоров", "Иван", "Иванович", 3, 74000);
        employee.addEmployee("Федоров", "Иван", "Иванович", 1, 70000);
        employee.printEmployee("Петров");
        employee.setDepartmentTool("Петров", 5);
        employee.setSalaryTool("Петров", 78000);
        employee.getSeparation();
        employee.printAllEmployees();
        employee.getSeparation();
        employee.printAllEmployeesData();
        employee.getSeparation();
        employee.setSalaryPercentTool(10);
        employee.amountSalaries();
        employee.amountSalariesDepartmentSet(3);
        employee.amountSalariesDepartment();
        employee.averageSalary();
        employee.findEmployeeSalaryMin();
        employee.findEmployeeSalaryMax();
    }
}