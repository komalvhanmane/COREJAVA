public class AccountMain {
    public static void main(String[] args) {
        CurrentAccount a=new CurrentAccount(101,"Komal",3000);
        CurrentAccount a1=new CurrentAccount(101,"Kom",3000);
        //Here it will check memory address while comparing
        //by default equals method on the basis of memory
        if(a.equals(a1)){
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
        //If you want check it by values then overide equals method
    }
}
