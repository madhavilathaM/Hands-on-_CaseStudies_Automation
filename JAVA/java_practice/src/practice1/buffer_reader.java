package practice1;
import java.io.BufferedReader;
import java.io.IOException;
import  java.io.InputStreamReader;

public class buffer_reader {
    public static void main(String[] args) throws IOException{
        int i; //int j;
      //  System.out.println("Enter any two numbers");
        BufferedReader number=new BufferedReader(new InputStreamReader(System.in));
        i=Integer.parseInt(number.readLine());
       // j=Integer.parseInt(number.readLine());
//         int sum=i+j;
//         int sub=i-j;
//         int mul=i*j;
//         int div=i/j;
//         System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(mul);
//        System.out.println(div);
//        System.out.println(i==j);//checking the variables values equal or not
//        System.out.println(i!=j);//checking the variables values equal or not
//        System.out.println(i<j);
//        System.out.println(i>j);
        //System.out.println(++i);
        //System.out.println(i++);
        System.out.println(--i);
//        System.out.println(i--);

    }
}
