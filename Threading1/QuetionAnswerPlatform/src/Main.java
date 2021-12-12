public class Main {
    public static void main(String[] args) throws InterruptedException {
        Info i=new Info();
        QuetionsWithOptions []q=i.QuetionAccept();
        Student s=i.accept(q);
        int score=i.Checking(s,q);
        System.out.println("----------------Result---------------");
        System.out.println("\t\tStudent Name    :"+s.getStuName());
        System.out.println("\t\tStudent roll No :"+s.getStuId());
        System.out.println("\t\tYour Score is   :"+score+"/10");
        System.out.println("-------------------------------------");
    }
}
