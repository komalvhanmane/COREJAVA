public class Calculation extends Thread{
    private int n1;
    private int n2;

    public Calculation(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public void run(){
        Add();//We will not call Add directly in run only we will need to add
    }

    public void Add(){
        int sum =n1+n2;
        System.out.println("Addition is: "+sum);
    }
}
