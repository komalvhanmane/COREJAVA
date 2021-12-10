public class Mmain {
    //Main is a main thread in a program
    public static void main(String[] args) throws InterruptedException {
        //Thread is a lightweight Process
        for (int i=0;i<5;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
