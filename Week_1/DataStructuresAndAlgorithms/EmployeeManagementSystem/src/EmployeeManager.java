public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Maximum Team Size Reached.");
        }
    }

    public Employee searchEmployee(String employeeId) {
        for (Employee employee: employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (Employee employee: employees) {
            if(employee != null)
                System.out.println(employee);
        }
    }

    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
