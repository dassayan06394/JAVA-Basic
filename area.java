import java.util.Scanner;
public class area {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        /*System.out.println("Enter base length of th triangle");
        float base = sc.nextFloat();
        System.out.println("Enter height length of the triangle");
        float height = sc.nextFloat();
        float area = (base*height)/2;
        System.out.println(area);*/
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sm = 0;
        sm = (a+b+c)/2;
        double area = Math.sqrt(sm*(sm-a)*(sm-b)*(sm-c));
        System.out.println(area);
    }
}