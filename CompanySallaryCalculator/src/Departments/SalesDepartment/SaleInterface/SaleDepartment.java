package Departments.SalesDepartment.SaleInterface;

import Departments.EmployeeFormation.Employee;
import Departments.EmployeeFormation.EmployeeRegistrationInterface;
import Departments.SavePersonal;

import java.util.List;

public abstract class SaleDepartment implements EmployeeRegistrationInterface {
    public List<Employee> employees;
    public SavePersonal personal;

    public SaleDepartment(SavePersonal personal){
        this.personal = personal;
    }

    public abstract void save();

    public SavePersonal getPersonal() {
        return personal;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
