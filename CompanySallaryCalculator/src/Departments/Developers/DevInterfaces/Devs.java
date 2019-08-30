package Departments.Developers.DevInterfaces;

import Departments.SavePersonal;

public interface Devs {
    DevelopersDepartment createFrontEnd();
    DevelopersDepartment createBackEnd();
    DevelopersDepartment getFrontEnd();
    DevelopersDepartment getBackEnd();

}
