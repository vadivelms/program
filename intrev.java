import java.util.Scanner;
class intrev
{
  public static void main(String a[])
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(Integer.valueOf(new StringBuilder(num).reverse()));
  }
}
