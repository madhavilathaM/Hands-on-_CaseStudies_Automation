package basics;

import java.util.Scanner;

public class table_do_while {
    public static void main(String[] args) {
        int num;int i=1;
        System.out.println("enter the number");
        Scanner multi=new Scanner(System.in);
        num=multi.nextInt();
        do {
            {
                System.out.println(num+"*"+(i)+"="+(num*i));
                i++;
            }
        }while (i<=10);
    }
}
