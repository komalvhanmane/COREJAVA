public class SavingAccount extends Account{
    public SavingAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }
    public boolean withdraw(double amount){
        if(getBal()>5000){
            setBal(getBal()-amount);
            return true;
        }
        else{
            return false;
        }
    }
}
