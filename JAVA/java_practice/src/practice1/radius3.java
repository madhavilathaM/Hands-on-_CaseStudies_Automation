package practice1;

public class radius3 {

    public static double area(int r)
    {
        double arg=3.14*r*r;
        return arg;
    }
    public static double area(int r,String H)
    {
        double per=2*3.14*r;
        return per;
    }
    public static void main(String[] args) {
        radius3 J=new radius3();
        System.out.println(J.area(7));
        System.out.println(J.area(7,"jjj"));
    }
}
