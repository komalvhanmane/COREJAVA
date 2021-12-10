import java.util.Scanner;
public class Area {
    public double triangle(int base, int height){
        return 0.5*base*height;
    }
    public double square(int base, int height){
        return base*height;
    }
    public double circle(int radius){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area s=new Area();
        do{
            System.out.println("Enter CHoice\n1-Traingle Area\n2-Reactangle Area\n3-Circle Area");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("Enter the Base");
                    int base=sc.nextInt();
                    System.out.println("Enter the Height");
                    int height=sc.nextInt();
                    double area=s.triangle(base,height);
                    System.out.println("Area of Triangle is :"+area);
                    break;
                }
                case 2:{
                    System.out.println("Enter the Base");
                    int base=sc.nextInt();
                    System.out.println("Enter the Height");
                    int height=sc.nextInt();
                    double area=s.square(base,height);
                    System.out.println("Area of Reactangle is :"+area);
                    break;
                }
                case 3:{
                    System.out.println("Enter the Radius of circle");
                    int r=sc.nextInt();
                    double area=s.circle(r);
                    System.out.println("Area of circle is "+area);
                    break;
                }
            }
            System.out.println("enter 1 For continuation");
        }while (sc.nextInt()==1);
    }
}
