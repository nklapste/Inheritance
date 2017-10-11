import javax.print.attribute.standard.PrinterInfo;

public class Customer extends Person implements Printable {
    private double projPrice;

    public Customer(String name, double projPrice){
        super(name);
        this.projPrice = projPrice;
    }

    public double getProjPrice(){
        return projPrice;
    }

    @Override
    public String PrintInfo(){
        return getName() + getProjPrice();
    }
}
