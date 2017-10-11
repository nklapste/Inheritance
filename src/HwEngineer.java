public class HwEngineer extends Employee implements SalaryRaisable{

    public HwEngineer(String name, double baseSalary){
        super(name, baseSalary);
    }

    //TODO
    @Override
    public double RaiseSalary(){
        return getBaseSalary()+getBaseSalary()*0.18;
    }
}
