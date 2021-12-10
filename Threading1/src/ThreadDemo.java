public class ThreadDemo extends Thread{
    String str;

    public ThreadDemo(String str) {
        this.str = str;
    }
    public void run(){
        System.out.print(str+" ");
    }
}
