import java.util.Date;

public class ProjManager extends SwEngineer implements Printable, SalaryRaisable {

    private Date projDeadline;

    public ProjManager(String name, double baseSalary, String projName, Date projDeadline){
        super(name, baseSalary, projName);
        this.projDeadline = projDeadline;
    }

    public Date getProjDeadline() {
        return projDeadline;
    }

    //TODO
    @Override
    public double RaiseSalary() {
        return getBaseSalary()+getBaseSalary()*0.24;
    }

    //TODO
    @Override
    public String PrintInfo() {
        return getName() + getProjName() + RaiseSalary() + getProjDeadline();
    }
}
