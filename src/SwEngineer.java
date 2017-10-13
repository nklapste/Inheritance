public class SwEngineer extends Employee {

    private String projName;

    public SwEngineer(String name, double baseSalary, String projName) {
        super(name, baseSalary);
        this.projName = projName;
    }

    public String getProjName() {
        return projName;
    }

    //todo own hash and equals
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
            SwEngineer sw = (SwEngineer) obj;
            return projName.equals(sw.getProjName());
        }
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        //todo other hash code stuff
        hash = 31 * hash ^ (null == projName ? 0 : projName.hashCode());
        return hash;
    }
}
