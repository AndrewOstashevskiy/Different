package Departments;

import Departments.Creators.*;
import Departments.EmployeeFormation.IPersonalFormation;
import Departments.EmployeeFormation.PersonalFormation;

public class Main {

    public static void Main(String[] args) {
        IPersonalFormation personalFormation = new PersonalFormation();

        CreateCompany company = new CreateCompany();
        company.applyAndSavePersonal(((PersonalFormation) personalFormation).applySale(),
                                     ((PersonalFormation) personalFormation).applyBackEnd(),
                                      ((PersonalFormation) personalFormation).applyFrontEnd());

        company.getAllPersonalList();

    }


}
