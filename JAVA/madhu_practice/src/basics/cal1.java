package basics;

import java.util.Scanner;

public class cal1 {

//     public static void add(int i,int j)
//     {
//         int sum=i+j;
//         System.out.println(sum);
//     }
//     public static void result(int m,int p,int c)
//     {
//         int avg=(m+p+c)/3;
//         System.out.println(avg);
//     }

     public static void array1(int k[])

     {
         for(int j=0;j<k.length;j++)
         {
             System.out.println(k[j]);
         }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int i=sc.nextInt();
//        int j=sc.nextInt();
//        System.out.println("entr maths marks");
//        int m= sc.nextInt();
//        int p= sc.nextInt();
//        int c= sc.nextInt();
        int k[]={ 3,4,5,6};
        cal1 S=new cal1();
        //S.add(i,j);
       // S.result(m,p,c);
        S.array1(k);


    }

    }


