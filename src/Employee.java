public class Employee {

        private int id=1;
        private String name;
        private String latName;
        private String surname;
        private int department;
        private float salary;

    public Employee(int id, String surname, String name, String latName, int department, float salary) {
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.latName=latName;
        this.department=department;
        this.salary=salary;
        }
        private Employee[] employees;
        private int size;

        public Employee() {
            this.employees = new Employee[4];
        }

        public void addEmployee(String surname, String name, String latName, int department, float salary) {
            Employee newEmployee = new Employee(id, surname, name,latName,department,salary);
            employees[size++] = newEmployee;
            id=this.id+1;
        }

        public int getId() {
        return id;
    }

        public String getSurname() {
        return surname;
    }

        public String getEmployee() {
        return surname+" "+name+" "+latName;
    }

        public int getDepartment() {
            return department;
    }

        public float getSalary() {
            return salary;
    }

        public int getCurrentSize() {
            return size;
    }

        public void setDepartmentTool(String surname, int newDepartment) {
            for (int i = 0; i < size; i++) {
                Employee employee = employees[i];
                if (employee.getSurname().equals(surname)) {
                    int result=employees[i].setDepartment(newDepartment);
                    System.out.println("Сотрудник id:" +employees[i].getId()+" отдел изменён на "+result);
                    return;
                }
            }
            System.out.println("Сотрудник с Фамилией: " + surname + " не найден!");
        }

    public void setSalaryTool(String surname, int newSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSurname().equals(surname)) {
                float result=employees[i].setSalary(newSalary);
                System.out.println("Сотрудник id:" +employees[i].getId()+" зарплата изменена на "+result);
                return;
            }
        }
        System.out.println("Сотрудник с Фамилией: " + surname + " не найден!");
    }

    public void setSalaryPercentTool(float percent) {
        float percentOut=percent/100;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
           float newSalary=employees[i].getSalary()+employees[i].getSalary()*percentOut;
                float result=employees[i].setSalary(newSalary);
                System.out.println("Сотрудник id:" +employees[i].getId()+" новая зарплата "+result);
            }
    }

    public void findEmployeeSalaryMin() {
        float min=1000000;
        String minEmployee="";
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (min>employees[i].getSalary()) {
                min=employees[i].getSalary();
                minEmployee=employees[i].getEmployee();
            }
        }
        System.out.println("Минимальная зарплата у "+minEmployee+" и равна " +min+" руб.");
    }

    public void findEmployeeSalaryMax() {
        float max=0;
        String maxEmployee="";
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (max<employees[i].getSalary()) {
                max=employees[i].getSalary();
                maxEmployee=employees[i].getEmployee();
            }
        }
        System.out.println("Максимальная зарплата у "+maxEmployee+" и равна " +max+" руб.");
    }

    public int setDepartment(int newDepartment) {
        department=newDepartment;
        return newDepartment;
    }

    public float setSalary(float newSalary) {
        salary=newSalary;
        return newSalary;
    }

    public void printEmployee(String surname) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSurname().equals(surname)) {
                System.out.println(employee.getId() + ": " +employee.getEmployee()+" Отдел "+employee.getDepartment()+" Зарплата "+employee.getSalary());
                return;
            }
        }
        System.out.println("Сотрудник с Фамилией: " + surname + " не найден!");
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getEmployee());
        }
        System.out.println("Всего: " +getCurrentSize());
    }

    public void printAllEmployeesData() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getId() + ": " +employee.getEmployee()+" Отдел "+employee.getDepartment()+" Зарплата "+employee.getSalary());
        }
        System.out.println("Всего: " +getCurrentSize());
    }

    public void amountSalaries() {
        float sum = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            sum=sum+employee.getSalary();
        }
        System.out.println("Затраты на зарплату в месяц "+sum);
    }

    public void amountSalariesDepartment() {
        float sum = 0;
        float sum1 = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employees[i].getDepartment() == 1) {
                sum1 = sum1 + employee.getSalary();
            } else {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("Затраты на зарплату в месяц на отдел 1 " + sum1 + " Затраты на остальные отделы "+sum);
    }

    public void amountSalariesDepartmentSet(int department) {
        float sumDepartment = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employees[i].getDepartment() == department) {
                sumDepartment = sumDepartment + employee.getSalary();
            }
        }
        System.out.println("Затраты на зарплату в месяц на отдел " + department + " " + sumDepartment);
    }

    public void averageSalary() {
        float sum = 0;
        float average=0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            sum=sum+employee.getSalary();
        }
        average=sum/size;
        System.out.println("Средняя зарплата в месяц "+average);
    }


    public void getSeparation() {
        String a="-";
        System.out.println(a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a);
    }
}
