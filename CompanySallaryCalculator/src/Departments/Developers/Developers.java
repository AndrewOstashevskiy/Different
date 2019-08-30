package Departments.Developers;

import Departments.Developers.DevInterfaces.DevelopersDepartment;
import Departments.Developers.DevInterfaces.Devs;
import Departments.SavePersonal;

public class Developers implements Devs {

    private DevelopersDepartment frontEnd;
    private DevelopersDepartment backEnd;
    private SavePersonal personal;

    public Developers(SavePersonal personal){
        this.personal = personal;
    }

    @Override
    public DevelopersDepartment createFrontEnd() {
        frontEnd = new FrontEndDevelopers(personal);
        return frontEnd;
    }

    @Override
    public DevelopersDepartment createBackEnd() {
        backEnd = new BackEndDevelopers(personal);
        return backEnd;
    }

    @Override
    public DevelopersDepartment getFrontEnd() {
        return frontEnd;
    }

    @Override
    public DevelopersDepartment getBackEnd() {
        return backEnd;
    }

    @Override
    public String toString() {
        return "Developers \n {" +
                frontEnd +
                "\n  " + backEnd +
                '}';
    }
}
