package basics;

import java.util.Scanner;

public class cal2 {

    public static void family(String C[]) {
        for (int j = 0; j < C.length; j++) {
            System.out.println(C[j]);
        }
    }

    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a is big");
        } else {
            System.out.println("b is big");
        }
    }

    public static void madhu1(int L, int r, int s, String P) {
        switch (L) {
            case 1:
                if (r > s) {
                    System.out.println("r is big");
                } else {
                    System.out.println("s is big");
                }
                break;

            case 2:
                System.out.println(P.toUpperCase());
                break;
            default:
                System.out.println("nothing");

        }
    }
        public static void main (String[]args){
            Scanner M = new Scanner(System.in);
//        String C[]={"babu","madhavi"};
            cal2 K = new cal2();
//        K.family(C);
//            int a = M.nextInt();
//            int b = M.nextInt();
            int L = M.nextInt();
             int r = M.nextInt();
             int s = M.nextInt();
            String P = M.nextLine();
//            K.compare(a, b);
            K.madhu1(L,r,s,"lekha");


        }
    }

