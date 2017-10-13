public class Employee extends Person {
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
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
            Employee e = (Employee) obj;
            return (baseSalary == e.getBaseSalary());
        }

    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        // double primitive will never be null (init to 0.0 normally)
        hash = 31 * hash ^ Double.valueOf(baseSalary).hashCode();
        return hash;
    }
}

