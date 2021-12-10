public class Main {
    public static void main(String[] args) throws InterruptedException {
        Info i=new Info();
        QuetionsWithOptions []q=i.QuetionAccept();
        Student s=i.accept(q);
        int score=i.Checking(s,q);
        System.out.println("Your Score is : "+score+"/10");

    }
}
