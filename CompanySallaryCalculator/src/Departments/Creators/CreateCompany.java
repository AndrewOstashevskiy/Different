package Departments.Creators;

import Departments.EmployeeFormation.Employee;

import java.util.List;

public class CreateCompany {

    private DepartmentFactory departmentFactory;
    private DepartsmenCreator departsmenCreator;

    public CreateCompany(){
        departmentFactory = new DepartmentFactory();
        departsmenCreator = new DepartsmenCreator(departmentFactory);
    }

    public void applyAndSavePersonal(List<Employee> sale,
                              List<Employee> back,
                              List<Employee> front){

        departsmenCreator.getSaleDepartment().fillListByUsers(sale);
        departsmenCreator.getDevelopersDepartment().getBackEnd().fillListByUsers(back);
        departsmenCreator.getDevelopersDepartment().getFrontEnd().fillListByUsers(front);

        departsmenCreator.getSaleDepartment().save();
        departsmenCreator.getDevelopersDepartment().getFrontEnd().save();
        departsmenCreator.getDevelopersDepartment().getBackEnd().save();
    }

    public void applyAndSaveSales(List<Employee> sale
                                     ){
        departsmenCreator.getSaleDepartment().fillListByUsers(sale);
        departsmenCreator.getSaleDepartment().save();
    }

    public void applyAndSaveBackEndDevs(List<Employee> back){
        departsmenCreator.getDevelopersDepartment().getBackEnd().fillListByUsers(back);
        departsmenCreator.getDevelopersDepartment().getBackEnd().save();
    }

    public void applyAndSaveFrontEndDevs(List<Employee> back){
        departsmenCreator.getDevelopersDepartment().getFrontEnd().fillListByUsers(back);
        departsmenCreator.getDevelopersDepartment().getFrontEnd().save();
    }

    public void getSales(){
        System.out.println(departsmenCreator.getSaleDepartment().getEmployees());
    }

    public void getFrontEndDevs(){
        System.out.println(departsmenCreator.getDevelopersDepartment().getFrontEnd().getFrontEndDevs());
    }

    public void getBackEndDevs(){
        System.out.println(departsmenCreator.getDevelopersDepartment().getBackEnd().getBackEndDevs());
    }

    public void getAllPersonalList(){
        System.out.println(departmentFactory.getPersonal().getEmployees());
    }
}
