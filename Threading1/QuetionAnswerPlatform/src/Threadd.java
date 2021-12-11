public class Threadd extends Thread{
    String str;

    public Threadd(String str) {
        this.str = str;
    }
    public void run(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
