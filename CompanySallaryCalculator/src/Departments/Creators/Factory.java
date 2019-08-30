package Departments.Creators;

import Departments.Developers.DevInterfaces.Devs;
import Departments.SalesDepartment.SaleInterface.SaleDepartment;

public interface Factory {
    SaleDepartment createSaleDepartment();
    Devs createDevelopersDepartment();
}
