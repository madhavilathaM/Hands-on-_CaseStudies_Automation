package practice1;
import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;

public class table {
    public static void main(String[] args) throws IOException {
        int num;
        System.out.println("Enter A NUMBER");
        BufferedReader table = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(table.readLine());
        for (int i = 0; i < 10; i++) {
            System.out.println(num + "*" + (i + 1) + "=" + num * (i + 1));
        }
    }
}
