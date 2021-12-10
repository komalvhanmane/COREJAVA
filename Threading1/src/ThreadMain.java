public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1=new ThreadDemo("Welcome");
        ThreadDemo t2=new ThreadDemo("To");
        ThreadDemo t3=new ThreadDemo("Java");
        t1.start();//This method will start the Run
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        t3.start();
        //We can predict the order of thread Running

    }
}
