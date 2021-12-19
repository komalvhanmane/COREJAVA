import java.util.Scanner;

public class Info {
    Scanner sc=new Scanner(System.in);
    public QuetionsWithOptions[] QuetionAccept(){
        System.out.println("---------------Welcome---------------");
        //Lets take 10 Quetions
        QuetionsWithOptions[] q =new QuetionsWithOptions[2];
        for(int i=0;i<q.length;i++){
            System.out.println("Enter Quetion Number with Underscore dont use space : "+(i+1));
            String que=sc.next();
            String[] alloption=new String[4];
            for(int j=0;j<4;j++){
                System.out.println("Enter Option Number "+(j+1));
                String opt=sc.next();
                alloption[j]=opt;
                System.out.println();
            }
            Options opt=new Options(alloption[0],alloption[1],alloption[2],alloption[3]);
            System.out.println("Enter the Correct ans Option: ");
            int correctans=sc.nextByte();
            q[i]=new QuetionsWithOptions(que,correctans);
            q[i].setOpt(opt);
        }
        System.out.println("----------------------Thank you---------------------");
        return q;
    }
    public int[] displayQuetion(QuetionsWithOptions[] q) throws InterruptedException {
        int[] response=new int[q.length];
        for(int i=0;i<q.length;i++){
            System.out.println("\nYou have to answer in 10 Seconds only automaticallly Next quetion will display after each 10 seconds");
            //String []opt=q[i].getOptions();
            System.out.println("-----------------------------------------------------");
            System.out.println("Quetion 1:");
            System.out.println(q[i].getQue());
            System.out.println("Option 1: "+q[i].getOpt().getOption1());
            System.out.println("Option 2: "+q[i].getOpt().getOption2());
            System.out.println("Option 3: "+q[i].getOpt().getOption3());
            System.out.println("Option 4: "+q[i].getOpt().getOption4());

            Thread.sleep(9000);
            //Threadd td=new Threadd("Java");
            //td.start();
            boolean ac=false;
            int opt = 0;
            System.out.print("Enter Option number: ");
            while(!ac)
            {
                try{
                    opt=sc.nextInt();
                    System.out.println();
                    ac=true;
                }catch(Exception e){
                    System.out.println("!!!!!!!!!!Enter the option number!!!!!!!!!!!");
                }
            }
            response[i]=opt;
            ac=false;
        }
        return response;
    }
    public Student accept(QuetionsWithOptions[] q) throws InterruptedException {
        System.out.println("--------------------Welcome--------------------");
        System.out.println("Enter your Name....");
        String name=sc.next();
        System.out.println("Welcome "+name);
        System.out.println("Enter your Roll Number.....");
        int rollNo=sc.nextByte();
        System.out.println("Lets Begin with Test Enter 1 to start");
        int[]reponse = new int[q.length];
        if(sc.nextInt()==1){
            reponse=displayQuetion(q);
        }
        Student s=new Student(rollNo,name,reponse);
        return s;
    }
    public int Checking(Student s,QuetionsWithOptions q[]){
        int[]reponse=s.getAns();

        int score=0;
        for(int i=0;i<q.length;i++){
            if(reponse[i]==q[i].getAns()){
                score++;
            }
        }
        return score;
    }

}
