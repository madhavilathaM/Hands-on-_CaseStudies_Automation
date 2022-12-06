package basics;

import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<Integer>();
        ArrayList<String> family=new ArrayList<String>();
        family.add("babu");
        family.add("lekha");
        i.add(2);
        i.add(5);
        i.add(0,5);

        i.remove(0);
        i.remove(1);
        //i.remove(2);
        //System.out.println(i);
       // System.out.println(i.isEmpty());
        System.out.println(family);

    }
}
