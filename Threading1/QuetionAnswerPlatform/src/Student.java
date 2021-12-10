public class Student {
    private int stuId;
    private String stuName;
    private int ans[];

    public Student(int stuId, String stuName, int[] ans) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.ans = ans;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int[] getAns() {
        return ans;
    }

    public void setAns(int[] ans) {
        this.ans = ans;
    }
}
