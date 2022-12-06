package basics;



 class lekha
{
int a;int b; String name;

    public void add()
    {
        System.out.println(a+b);
    }

    public void print()
    {
        System.out.println(name);
    }
}
public class abstrct {
    public static void main(String[] args) {


        lekha L=new lekha();
        L.a=3;
        L.b=5;
        L.name="madhavi";
        L.add();
        L.print();

    }
}
