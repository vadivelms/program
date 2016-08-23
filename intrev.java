import java.util.Scanner;
class intrev
{
  public static void main(String a[])
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    String s=String.valueOf(num);
    StringBuilder sb=new StringBuilder(s);
    System.out.println(sb.reverse());
  }
}
