package Departments.Creators;

import Departments.Developers.Developers;
import Departments.SalesDepartment.Finansists;
import Departments.SalesDepartment.SaleInterface.SaleDepartment;
import Departments.SavePersonal;

public class DepartmentFactory implements Factory {

    private SavePersonal personal;

    public DepartmentFactory(){
        personal = new SavePersonal();
    }

    @Override
    public SaleDepartment createSaleDepartment() {
        return new Finansists(personal);
    }

    @Override
    public Developers createDevelopersDepartment() {
        Developers devs = new Developers(personal);
        devs.createBackEnd();
        devs.createFrontEnd();
        return devs;
    }

    public SavePersonal getPersonal() {
        return personal;
    }
}
