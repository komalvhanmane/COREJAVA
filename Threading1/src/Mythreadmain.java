public class Mythreadmain {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        //Thread is created here
        t1.start();//Runnable
        System.out.println("thank you");
        //IMP Interview Question
        /*Life cycle of thread is:-
        * Create->(start)Runnable-->running(run)-->dead
        * */
    }
}
