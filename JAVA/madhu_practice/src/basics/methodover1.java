package basics;

import java.util.Scanner;

public class methodover1 {


  public static void madhu(int a,int b)
  {
      System.out.println(a+b);
  }

  public static void madhu(String Str)
  {
   System.out.println(Str);
  }

    public static void main(String[] args) {
        Scanner K=new Scanner(System.in);
        //System.out.println("enter two numbers");
        //int a=K.nextInt();
        //int b=K.nextInt();
        System.out.println("enter string name");
        String Str=K.nextLine();

      methodover1 M=new methodover1();
     // M.madhu(a,b);
      M.madhu("my daughter name"+Str);

    }

}
