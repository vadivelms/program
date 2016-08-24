
import java.util.ArrayList;
import java.util.Scanner;
public class firstrepetedelement
{

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String sl=sc.nextLine();
		String[] sary=sl.split(" ");
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(String s:sary)
		{
			al.add(Integer.parseInt(s));
		}
		int count=0;
		for(int i:al)
		{
			
			count=0;
			for(int j:al)
			{
				
				if(i==j)
					count++;
			}
			if(count>=2)
			{
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
