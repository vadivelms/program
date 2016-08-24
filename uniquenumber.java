import java.util.ArrayList;
import java.util.Scanner;


public class uniquenumber
{

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		String sl=sc.nextLine();
		
		String[] sp=sl.split(" ");
		
		for(String s:sp)
			al.add(Integer.parseInt(s));
		
		for(int j=0;j<al.size();j++)
		{
			int count=0;
			for(int i=0;i<al.size();i++)
			{
				if(al.get(j)==al.get(i))
				{
					count++;
				}
				
			}
			if(count==1)
				System.out.print(al.get(j));
		}
		

	}

}
