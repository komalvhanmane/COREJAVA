public class Customer {
    private String custName;
    private String custAdd;
    private String phoneNo;
    private int custAge;
    private String addharNo;

    public Customer(String custName, String custAdd, String phoneNo, int custAge, String addharNo) {
        this.custName = custName;
        this.custAdd = custAdd;
        this.phoneNo = phoneNo;
        this.custAge = custAge;
        this.addharNo = addharNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAdd() {
        return custAdd;
    }

    public void setCustAdd(String custAdd) {
        this.custAdd = custAdd;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    public String getAddharNo() {
        return addharNo;
    }

    public void setAddharNo(String addharNo) {
        this.addharNo = addharNo;
    }
}
