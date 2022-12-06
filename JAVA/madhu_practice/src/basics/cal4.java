package basics;

import java.util.Scanner;

public class cal4 {
    public static void Area(int r)
    {
        double A=3.14*r*r;
        double P=2*3.14*r;
        System.out.println(A);
        System.out.println(P);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        cal4 K=new cal4();
        K.Area(r);

    }
}
