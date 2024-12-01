import java.util.*;
class DuplicateCharacterFinder 
{
	/*char a[];
	public DuplicateCharacterFinder(String name)
	{
		
	}*/
	//public void convert()
	
	 public void findDuplicates(String name)
	 {
		 char a[]=name.toCharArray();
		 Scanner xyz=new Scanner(System.in);
		 int count=0;
		 int q=0;
		for(int i=0;i<a.length;i++)
		{boolean flag=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j;k>=0;k--)
					{
						if(a[k]==a[j])
						{
							flag=false;
						}
					}
				}
			}
			if(flag=true)
			{
				count++;
			}
		}
		
		char c[]=new char[count];
		
		for(int i=0;i<a.length;i++)
		{boolean flag=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j;k>=0;k--)
					{
						if(a[k]==a[j])
						{
							flag=false;
						}
					}
				}
			}
			if(flag=true)
			{
				c[q]=a[i];
				q++;
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		
		
	 }
}
public class DArrayChar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=xyz.nextInt();
		xyz.nextLine();
		System.out.println("enter the name ");
		String name=xyz.nextLine();
		
		DuplicateCharacterFinder D=new DuplicateCharacterFinder();
	
		D.findDuplicates(name);
	}	
}