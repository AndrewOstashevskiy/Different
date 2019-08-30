package Departments;

import Departments.EmployeeFormation.Employee;

import java.util.ArrayList;
import java.util.List;

public class SavePersonal {
    private List<Employee> employees;

    public void setList(List<Employee> list){
        if (employees == null){
            employees = new ArrayList<>();
        }
        employees.addAll(list);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
