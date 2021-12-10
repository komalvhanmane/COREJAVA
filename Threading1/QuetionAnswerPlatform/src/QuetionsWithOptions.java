public class QuetionsWithOptions {
    private String que;

    public Options getOpt() {
        return opt;
    }

    public void setOpt(Options opt) {
        this.opt = opt;
    }

    //private String[] options;
    private Options opt;
    private int ans;

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public QuetionsWithOptions(String que, int ans) {
        this.que = que;
        this.ans=ans;
    }
}
