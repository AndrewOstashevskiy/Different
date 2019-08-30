package Departments.Developers;

import Departments.Developers.DevInterfaces.DevelopersDepartment;
import Departments.EmployeeFormation.Employee;
import Departments.SavePersonal;

import java.util.List;

public class BackEndDevelopers extends DevelopersDepartment {


    public BackEndDevelopers(SavePersonal personal) {
        super(personal);
    }

    @Override
    public void fillListByUsers(List<Employee> list) {
        backEndDevs = list;
    }

    @Override
    public void save() {
        personal.setList(backEndDevs);
    }

    @Override
    public String toString() {
        return "BackEndDevelopers{" +
                "backEndDevs=" + backEndDevs +
                '}';
    }
}
