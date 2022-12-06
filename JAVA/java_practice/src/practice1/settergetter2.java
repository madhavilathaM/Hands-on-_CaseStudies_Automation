package practice1;

class madhu2
{
    private String name;
  public void ml(String U)
  {
    name=U;
      //System.out.println(name);
  }
  public String get()
  {
      return name;
  }
}
public class settergetter2 {
    public static void main(String[] args) {
        madhu2 M=new madhu2();
       M.ml("lekha");
       System.out.println(M.get());

    }
}
