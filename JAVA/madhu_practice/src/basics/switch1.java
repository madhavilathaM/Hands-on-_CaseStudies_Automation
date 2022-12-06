package basics;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        int day;
        Scanner D=new Scanner(System.in);
        day=D.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Today is "+"Monday");
                break;
            case 2:
                System.out.println("Today is "+"Sunday");
                break;
            default:
                System.out.println("Today is "+"WEEKEND");
        }
    }
}
