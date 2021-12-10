public class CurrentAccount extends Account{
    public CurrentAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }
    public boolean withdraw(double amount){
        if(getBal()>1000){
            setBal(getBal()-amount);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        CurrentAccount c=(CurrentAccount) obj;
        if(this.getAccNo()==c.getAccNo()){
            return true;
        }
        else {
            return false;
        }
    }
}
