package basics;

import java.util.Scanner;

public class cal3 {

    public static void table(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
    public static void city(String C)
    {
        System.out.println(C.toLowerCase());
    }
    public static void main(String[] args) {

        System.out.println("Enter any number");
        Scanner T=new Scanner(System.in);
        int num=T.nextInt();

        String C=T.nextLine();
       cal3 P=new cal3();

       P.table(num);
        System.out.println("entr city name");
       P.city(C);

    }


}
