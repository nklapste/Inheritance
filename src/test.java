public class test {

    // main to test interfaces and extends implementation
    public static void main(String[] args) {
        ProjManager pm = new ProjManager("test_pm", 6000, "test_proj", null);
        System.out.println(pm.getBaseSalary());
        System.out.println(pm.getName());
        System.out.println(pm.RaiseSalary());
        System.out.println(pm.PrintInfo());


        HwEngineer hw = new HwEngineer("test_hw", 6000);
        System.out.println(hw.getBaseSalary());
        System.out.println(hw.getName());
        System.out.println(hw.RaiseSalary());


        Customer c = new Customer("steve", 2.0);
        System.out.println(c.PrintInfo());
    }
}
