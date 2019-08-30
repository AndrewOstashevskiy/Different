package Departments.SalesDepartment;

import Departments.EmployeeFormation.Employee;
import Departments.SalesDepartment.SaleInterface.SaleDepartment;
import Departments.SavePersonal;

import java.util.List;

public class Finansists extends SaleDepartment {

    public Finansists(SavePersonal personal){
        super(personal);
    }

    @Override
    public void fillListByUsers(List<Employee> list) {
        this.employees = list;
    }

    @Override
    public void save() {
        personal.setList(employees);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Finansists \n {" +
                "employees=" + employees +
                '}';
    }
}
