import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> paymentMethods;

    public Wallet(String name) {
        this.name = name;
        this.paymentMethods = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.paymentMethods.size();
    }

    public void addItem(IScan item) {
        this.paymentMethods.add(item);
    }

}
