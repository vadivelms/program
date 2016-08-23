import java.util.Scanner;
public class strrev 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String instr=sc.nextLine();
		String rev=String.valueOf(new StringBuilder(instr).reverse());
		
			System.out.println(rev);
	}
}
