package Departments.Developers;

import Departments.Developers.DevInterfaces.DevelopersDepartment;
import Departments.EmployeeFormation.Employee;
import Departments.SavePersonal;

import java.util.List;

public class FrontEndDevelopers extends DevelopersDepartment {


    public FrontEndDevelopers(SavePersonal personal) {
        super(personal);
    }

    @Override
    public void fillListByUsers(List<Employee> list) {
        this.frontEndDevs = list;
    }

    @Override
    public void save() {
        personal.setList(frontEndDevs);
    }

    @Override
    public String toString() {
        return "FrontEndDevelopers{" +
                "frontEndDevs=" + frontEndDevs +
                '}';
    }
}
