package practice1;
import java.io.BufferedReader;
import  java.io.IOException;
import  java.io.InputStreamReader;
public class buffer_if {
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        if (a > b) {
            System.out.println(a - b);
        } else if (a < b) {
            System.out.println(a * b);

        } else if (a == b) {
            System.out.println(a + b);
        } else
            System.out.println("fail");
    }
}