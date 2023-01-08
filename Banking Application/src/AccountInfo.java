import java.util.Scanner;

public class AccountInfo {
    //using array data structure
    Scanner sc= new Scanner(System.in);

    public Account[] create(){
        System.out.println("Enter the Total Number of Accounts ");
        int n=sc.nextInt();
        Account[] acc =new Account[n];
        System.out.println("Enter the Data one by one for each Account ");
        for(int i=0;i<acc.length;i++){
            System.out.println("Enter the Customer data For Account no "+(i+1));
            System.out.println("\nEnter the Name Of Customer ");
            String custName=sc.next();
            System.out.println("Enter the Customer Address Only Apartement Name with room No ");
            String custAdd=sc.next();
            System.out.println("Enter valid phone number");
            String phoneNo=sc.next();
            System.out.println("Enter your age in numbers");
            int custAge=sc.nextInt();
            System.out.println("Enter the Adhar Number of customer");
            String addharNo=sc.next();
            Customer cust=new Customer(custName,custAdd,phoneNo,custAge,addharNo);
            System.out.println("Thank you for filling customer details");
            System.out.println("\nNow Pls fill Account Details");
            System.out.println("Enter the inital Balance you want in your bank account");
            double Bal=sc.nextDouble();
            int accNo=100+i;
            System.out.println("Your Account Number is :- "+accNo);
            acc[i]=new Account(accNo,Bal,cust);
        }
        System.out.println("Thank you very much for Filling the information");
        return acc;
    }
    public void display(Account[] acc){
        System.out.println("Enter the Customer Account No to see Their Details");
        int accNo=sc.nextInt();
        for(int i=0;i<acc.length;i++){
            if(accNo==acc[i].getAccNo()){
                System.out.println("-----------------------Details-----------------------");
                System.out.println("Customer Name    : "+acc[i].getCustomer().getCustName());
                System.out.println("Customer Address : "+acc[i].getCustomer().getCustAdd());
                System.out.println("Customer PhoneNo : "+acc[i].getCustomer().getPhoneNo());
                System.out.println("Customer Age     : "+acc[i].getCustomer().getCustAge());
                System.out.println("Customer Adhar no: "+acc[i].getCustomer().getAddharNo());
                System.out.println("Account Number   : "+acc[i].getAccNo());
                System.out.println("Account Balance  : "+acc[i].getAccBal());
                System.out.println("------------------------------------------------------");
                break;
            }
        }
    }
    public void update(Account[] acc){
        System.out.println("--------------Welcome---------------");
        System.out.println("Enter the Account Number For updation Process");
        int accNo=sc.nextInt();
        for(int i=0;i<acc.length;i++){
            if(accNo==acc[i].getAccNo()){
                do{
                    System.out.println("Which value you want to update ? ");
                    System.out.println("1-Name\n2-Address\n3-PhoneNo\n4-Age");
                    System.out.println("Enter your Option");
                    switch (sc.nextInt()){
                        case 1:{
                            System.out.println("Enter the Corrected Name you want to change ");
                            acc[i].getCustomer().setCustName(sc.next());
                            System.out.println("Your Name Successfully Updated");
                            System.out.println("Updated Name : "+acc[i].getCustomer().getCustName());
                            break;
                        }
                        case 2:{
                            System.out.println("Enter the Correct Address You want to change ");
                            acc[i].getCustomer().setCustAdd(sc.next());
                            System.out.println("Your Address Successfully Changed");
                            System.out.println("Updated Name : "+acc[i].getCustomer().getCustAdd());
                            break;
                        }
                        case 3:{
                            System.out.println("Enter the Correct Phone Number You want to change ");
                            acc[i].getCustomer().setPhoneNo(sc.next());
                            System.out.println("your phone number successfully Corrected ");
                            System.out.println("Updated Name : "+acc[i].getCustomer().getPhoneNo());
                            break;
                        }
                        case 4:{
                            System.out.println("Enter your Correct Age You want to change ");
                            acc[i].getCustomer().setCustAge(sc.nextInt());
                            System.out.println("Your age successfully changed");
                            System.out.println("Updated Age :"+acc[i].getCustomer().getCustAge());
                            break;
                        }
                    }
                    System.out.println("Do you want to update any other information ? if (yes-1/No-0)");
                }while(sc.nextInt()==1);
            }
        }
    }
}