package basics;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        float a;float b;float c;float d;
        float e;
        System.out.println("Enter Subject marks");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();c=sc.nextFloat();d=sc.nextFloat();e=sc.nextFloat();
        float total=a+b+c+d+e;
        float Avg=total/5;
        float per=((total/500)*100);
        System.out.println("Average of 5 Subjects: "+Avg);
        System.out.println("percentage of subjects "+per);

    }
}
