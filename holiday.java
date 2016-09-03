import java.util.Scanner;
class holiday
{
  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    String day=sc.nextLine();
    if(day.equalsIgnorwCase("sunday"))
    {
      System.out.println(false);
    }
    else
    {
      System.out.println(true);
      }
    }
  }
