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


        // demo for custom equals and hashcode
        // test equation of ProjManager
        ProjManager pm0 = new ProjManager("test_pm", 1, "test", null);
        ProjManager pm1 = new ProjManager("test_pm", 1, "test", null);
        ProjManager pm2 = new ProjManager("test_pm", 0, "test", null);
        System.out.println(pm0.equals(pm1));
        System.out.println(pm0.equals(pm2));

        // test equation of HwEngineer
        HwEngineer hw0 = new HwEngineer("test_hw", 1);
        HwEngineer hw1 = new HwEngineer("test_hw", 1);
        HwEngineer hw2 = new HwEngineer("test_hw", 0);
        System.out.println(hw0.equals(hw1));
        System.out.println(hw0.equals(hw2));

        System.out.println(hw0.equals(pm0));
        System.out.println(pm0.equals(hw0));
    }
}
