
import java.util.Scanner;
public class numbertostring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		char car[]=String.valueOf(number).toCharArray();
		
			
		for(char c:car)
		{
			int i=Integer.parseUnsignedInt(String.valueOf(c));
			char cr=(char) (96+i);
			System.out.print(cr);
		}
		
	}

}
