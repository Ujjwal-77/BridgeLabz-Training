import java.util.*;
public class CircleArea{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        int radius=sc.nextInt();
        double area=3.14*(Math.pow(radius,2));
        System.out.print(area);
    }
}