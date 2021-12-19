public class Logic {
    //factor
    public void factor(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public void factorial(int n){
        int F=1;
        for(int i=1;i<=n;i++){
            F=F*i;
        }
        System.out.println("Factorial is : "+F);
    }
    //Factorial
    public void primeTilln(int n){
        int i,j;
        for(i=2;i<n;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i){
                System.out.println(i);
            }
        }
    }
    //prime
    //revrse
    public int reverse1(int n){
        int reverse=0;
        while(n>0){
            int lastDigit=n%10;
            reverse=reverse*10+lastDigit;
            n=n/10;
        }
        System.out.println("Reverse of a number is :"+reverse);
        return reverse;
    }
    //palindrome or not
    public void palindrome(int n){
        if(reverse1(n)==n){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    public void neonnumber(int n){
        int initial_n=n;
        int sum=0;
        while (n>0){
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        if(sum*sum==initial_n){
            System.out.println("It is a neon number ");
        }
        else{
            System.out.println("It is not a neon number ");
        }
    }
    public void armstrongNumber(int n){
        int initial_n=n;
        int sum=0;
        while (n>0){
            int lastdigit=n%10;
            sum=sum+lastdigit*lastdigit*lastdigit;
            n=n/10;
        }
        if(sum==initial_n){
            System.out.println("It is a armstrong number ");
        }
        else{
            System.out.println("It is not a armstrong number ");
        }
    }
    public void fibbo(int n){
        int t1=1;
        int t2=1;
        int nextterm;
        for(int i=0;i<n;i++){
            System.out.println(t1);
            nextterm=t1+t2;
            t1=t2;
            t2=nextterm;
        }
    }
    public void arithematic(int a,int n,int d){
        for(int i=0;i<n;i++){
            System.out.println(a);
            a += d;
        }
    }
    public void geometric(int a,int d,int n){
        for(int i=0;i<n;i++){
            System.out.println(a);
            a=a*d;
        }
    }
}
