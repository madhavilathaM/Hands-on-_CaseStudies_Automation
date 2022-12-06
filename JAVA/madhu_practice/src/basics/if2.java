package basics;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        int marks;int M;int P;int C;

        Scanner re=new Scanner(System.in);
        //marks=re.nextInt();
System.out.println("Enter maths marks");
        M=re.nextInt();
        System.out.println("enter Physics marks");
        P=re.nextInt();
        System.out.println("enter che marks");
        C=re.nextInt();
        //marks=(M+P+C)/3;
       System.out.println("enter total marks");
        marks=re.nextInt();

        if(M>35&&P>35&&C>35&&marks>40)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
