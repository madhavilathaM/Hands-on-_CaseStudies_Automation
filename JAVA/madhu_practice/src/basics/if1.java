package basics;
import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner mo=new Scanner(System.in);
        int num1= mo.nextInt();
        int num2= mo.nextInt();
        int num3= mo.nextInt();
        if(num1>num3&&num1>num2)
        {
            System.out.println("The gretest numbr is "+num1);
        }
      else if (num2>num1&&num2>num3)
        {
            System.out.println("The gretest numbr is "+num2);
        } else if (num3>num1&&num3>num2) {

            System.out.println("The gretest numbr is "+num3);
        }
      else {
          System.out.println("give correct inpus");
        }
    }
}
