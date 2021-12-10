public class Account {
    //toString method is used to print object in the form of string
    private int accNo;
    private String Name;
    private double Bal;

    public Account(int accNo, String name, double bal) {
        this.accNo = accNo;
        Name = name;
        Bal = bal;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getBal() {
        return Bal;
    }

    public void setBal(double bal) {
        Bal = bal;
    }
    //Deposit Method
    public void deposit(double amount){
        setBal(getBal()+amount);
    }
}
