package basics;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int i;
        int j;
        System.out.println("Enter two numbers");
        Scanner add=new Scanner(System.in);
        i=add.nextInt();
        j=add.nextInt();
        int sum=i+j;
        int mul=i*j;

        System.out.println("sum of two numbers "+sum);
        System.out.println("multi of two numbers "+mul);
    }
}
