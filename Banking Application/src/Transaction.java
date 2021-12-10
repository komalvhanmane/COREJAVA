import java.util.Scanner;
public class Transaction {
    Scanner sc=new Scanner(System.in);
    public void withdraw(Account []acc){
        System.out.println("Welcome to withdraw money");
        System.out.println("Enter the Account Number");
        int accNo=sc.nextInt();
        boolean b = false;
        for(int i=0;i<acc.length;i++){
             b=false;
            if(acc[i].getAccNo()==accNo){
                System.out.println("Enter the amount You want to withdraw ");
                double withdrawl=sc.nextDouble();
                acc[i].setAccBal(acc[i].getAccBal()-withdrawl);
                System.out.println("Collect Your Money "+withdrawl);
                System.out.println("-------Your Balance is ----------"+acc[i].getAccBal());
                System.out.println("-----------Thank you-----------");
                break;
            }
            else{
                b=true;
            }
        }
        if(b){
            System.out.println("Account Number is invalid");
        }
    }
    public void deposit(Account[] acc){
        System.out.println("Welcome to Deposit Money");
        System.out.println("Enter the Account Number ");
        int accNo=sc.nextInt();
        boolean b=false;
        for(int i=0;i<acc.length;i++){
            b=false;
            if(acc[i].getAccNo()==accNo){
                System.out.println("Enter the Money you want to deposit");
                double depost=sc.nextDouble();
                acc[i].setAccBal(acc[i].getAccBal()+depost);
                System.out.println("Money Deposited Successfully");
                System.out.println("--------Your Balance is -------"+acc[i].getAccBal());
                System.out.println("-------------Thank You-------------");
                break;
            }
            else{
                b=true;
            }
        }
        if(b){
            System.out.println("Account Number Invalid ");
        }
    }
}
