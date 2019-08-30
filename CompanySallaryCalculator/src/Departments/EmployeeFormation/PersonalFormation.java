package Departments.EmployeeFormation;

import java.util.List;

public class PersonalFormation implements IPersonalFormation {

    public List<Employee> applyFrontEnd(){
        EmployeeRegistration employeeRegistration = new EmployeeRegistration();
        employeeRegistration.formEmployeeList(new Employee("Greg", 1200));
        employeeRegistration.formEmployeeList(new Employee("Hary", 600));
        employeeRegistration.formEmployeeList(new Employee("Nicol", 400));

        return employeeRegistration.getEmployees();
    }

    public List<Employee> applyBackEnd(){
        EmployeeRegistration employeeRegistration = new EmployeeRegistration();
        employeeRegistration.formEmployeeList(new Employee("Ostin", 1200));
        employeeRegistration.formEmployeeList(new Employee("Dave", 4600));
        employeeRegistration.formEmployeeList(new Employee("Lucas", 2400));

        return employeeRegistration.getEmployees();
    }

    public List<Employee> applySale(){
        EmployeeRegistration employeeRegistration = new EmployeeRegistration();
        employeeRegistration.formEmployeeList(new Employee("David", 500));
        employeeRegistration.formEmployeeList(new Employee("Fred", 300));
        employeeRegistration.formEmployeeList(new Employee("Gerry", 400));

        return employeeRegistration.getEmployees();
    }
}
