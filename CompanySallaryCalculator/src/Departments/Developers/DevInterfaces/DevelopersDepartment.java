package Departments.Developers.DevInterfaces;

import Departments.EmployeeFormation.Employee;
import Departments.EmployeeFormation.EmployeeRegistrationInterface;
import Departments.SavePersonal;

import java.util.List;

public abstract class DevelopersDepartment implements EmployeeRegistrationInterface {
    public List<Employee> backEndDevs;
    public List<Employee> frontEndDevs;
    public SavePersonal personal;

    public DevelopersDepartment(SavePersonal personal) {
        this.personal = personal;
    }

public abstract void save();

    public List<Employee> getBackEndDevs() {
        return backEndDevs;
    }

    public void setBackEndDevs(List<Employee> backEndDevs) {
        this.backEndDevs = backEndDevs;
    }

    public List<Employee> getFrontEndDevs() {
        return frontEndDevs;
    }

    public void setFrontEndDevs(List<Employee> frontEndDevs) {
        this.frontEndDevs = frontEndDevs;
    }

    public SavePersonal getPersonal() {
        return personal;
    }
}
