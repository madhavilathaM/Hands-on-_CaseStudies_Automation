package basics;

import java.util.Scanner;

public class table_for_loop {
    public static void main(String[] args) {
        int num;int i;
        System.out.println("enter th number");
        Scanner multi=new Scanner(System.in);
        num=multi.nextInt();
        for(i=1;i<=20;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
