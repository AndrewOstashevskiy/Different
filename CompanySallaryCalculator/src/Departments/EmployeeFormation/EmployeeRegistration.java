package Departments.EmployeeFormation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegistration {
    private List<Employee> employees;

    public void formEmployeeList(Employee employee){
        if (employees == null){
            employees = new ArrayList<Employee>();
        }

        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
