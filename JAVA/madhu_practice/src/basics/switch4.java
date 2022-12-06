package basics;

public class switch4 {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int k=2;
        String M = "madhavi";

        switch (k) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(M);
                break;
            default:
                System.out.println("nothing");
        }
    }
}