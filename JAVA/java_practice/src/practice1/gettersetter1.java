package practice1;
class madhu1
{
   private int num; private  String str;

    public void setNumber(String T) {
        //num= S;
        str=T;
       // System.out.println(num);
        System.out.println(str);
    }
}
public class gettersetter1 {
    public static void main(String[] args) {
madhu1 R=new madhu1();
   //R.setNumber(345);
       // R.setNumber(456,"lekha");
        R.setNumber("Welcome to SET GET method");
    }
}
