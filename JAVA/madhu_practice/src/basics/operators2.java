package basics;
import java.util.Scanner;

public class operators2 {
    public static void main(String[] args) {
        System.out.println("Enter any five numbers");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        int num5=sc.nextInt();
        System.out.println("the average of numbers "+(num1+num2+num3+num4+num5)/5);
    }
}
