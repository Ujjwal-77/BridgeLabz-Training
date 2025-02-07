import java.util.*;
public class CylinderVolume{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
        int radius=sc.nextInt();
        System.out.print("Enter height:");
        int height=sc.nextInt();
        double volume=3.14*(Math.pow(radius,2))*height;
        System.out.print(volume);
    }
}