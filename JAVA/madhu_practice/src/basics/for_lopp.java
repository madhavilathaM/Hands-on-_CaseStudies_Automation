package basics;

public class for_lopp {
    public static void main(String[] args) {
//        for(int i=0;i<=10;i++)
//        {
//            System.out.println("madhavi");
//        }
        for(int k=1;k<=6;k++)
        {
            for(int b=k;b<=6;b++)
            {
                System.out.print(" ");
            }
            for(int b=1;b<=k;b++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
