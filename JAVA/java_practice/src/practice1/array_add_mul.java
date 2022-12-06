package practice1;

public class array_add_mul {
    public static void main(String[] args) {
        int i[]={4,5,6,7,8,9};
        int sum=0;
        int mul=1;
        for(int j=0;j<i.length;j++)
        {
            sum=sum+i[j];
            mul=mul*i[j];
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}
