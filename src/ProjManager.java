import java.util.Date;
import java.util.Objects;

public class ProjManager extends SwEngineer implements Printable, SalaryRaisable {

    private Date projDeadline;

    public ProjManager(String name, double baseSalary, String projName, Date projDeadline) {
        super(name, baseSalary, projName);
        this.projDeadline = projDeadline;
    }

    public Date getProjDeadline() {
        return projDeadline;
    }

    @Override
    public double RaiseSalary() {
        return getBaseSalary() + getBaseSalary() * 0.24;
    }

    @Override
    public String PrintInfo() {
        return getName() + getProjName() + RaiseSalary() + getProjDeadline();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        } else {
            ProjManager pm = (ProjManager) obj;
            return Objects.equals(projDeadline, pm.getProjDeadline());
        }
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash ^ (null == projDeadline ? 0 : projDeadline.hashCode());
        return hash;
    }
}
