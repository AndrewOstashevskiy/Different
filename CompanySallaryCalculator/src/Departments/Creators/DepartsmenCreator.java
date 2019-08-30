package Departments.Creators;

import Departments.Developers.DevInterfaces.Devs;
import Departments.SalesDepartment.SaleInterface.SaleDepartment;

public class DepartsmenCreator {
    private SaleDepartment saleDepartment;
    private Devs developersDepartment;

    public DepartsmenCreator(Factory factory){
        saleDepartment = factory.createSaleDepartment();
        developersDepartment = factory.createDevelopersDepartment();
    }

    public SaleDepartment getSaleDepartment() {
        return saleDepartment;
    }

    public Devs getDevelopersDepartment() {
        return developersDepartment;
    }


}
