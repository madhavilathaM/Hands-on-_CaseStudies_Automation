package basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class operators {
    public static void main (String[] args) throws IOException{
        int a; int b; String name;
   System.out.println("Enter any two numbers");
   System.out.println("enter  name");
   BufferedReader madhu=new BufferedReader(new InputStreamReader(System.in));
   a=Integer.parseInt(madhu.readLine());
   b=Integer.parseInt(madhu.readLine());
   name= madhu.readLine();
        int sum=a+b;
        int mul=a*b;
        //System.out.println("sum of two numbers "+sum);
       // System.out.println(mul);
        //System.out.println(a++);
       // System.out.println(++a);
        System.out.println(a!=b);
        System.out.println(name.toUpperCase());
    }
}
