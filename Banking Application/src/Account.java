public class Account {
    private int accNo;
    private double accBal;
    private Customer customer;

    public Account(int accNo, double accBal, Customer customer) {
        this.accNo = accNo;
        this.accBal = accBal;
        this.customer = customer;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
