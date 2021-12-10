import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AccountInfo ai=new AccountInfo();
        Transaction tr=new Transaction();
        System.out.println("Lets Create Account First press 1 :)");
        if(sc.nextInt()==1){
            Account[] acc = ai.create();
            do{
                System.out.println("Choose \n1-Display\n2-Update\n3-Withdraw\n4-Deposit");
                switch (sc.nextInt()){
                    case 1:{
                        System.out.println("Lets Display the Information");
                        ai.display(acc);
                        break;
                    }
                    case 2:{
                        System.out.println("Lets Update the Information");
                        ai.update(acc);
                        break;
                    }
                    case 3:{
                        System.out.println("Lets Withdraw Money");
                        tr.withdraw(acc);
                        break;
                    }
                    case 4:{
                        System.out.println("Lets Deposit Money");
                        tr.deposit(acc);
                        break;
                    }
                }
                System.out.println("For Continuing press 1");
            }while(sc.nextInt()==1);
        }
    }
}
