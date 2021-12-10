public class Employee {
    private int emplID;
    private String emplName;
    private double emplSal;

    public Employee(int emplID, String emplName, double emplSal) {
        this.emplID = emplID;
        this.emplName = emplName;
        this.emplSal = emplSal;
    }

    public int getEmplID() {
        return emplID;
    }

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public double getEmplSal() {
        return emplSal;
    }

    public void setEmplSal(double emplSal) {
        this.emplSal = emplSal;
    }
}
