import java.util.*;
public class pair 
{

	public static void main(String[] args) 
	{
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of test cases: ");
		int t=sc.nextInt();
		while(t>0)
		{
			System.out.println("Enter the no.elements: ");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements in the array: ");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					int sum=(a[i]+a[j]);
					if(sum%4==0)
					{
						count++;
					}
					continue;
				}
			}
			System.out.println(count);
			t--;
		}
  		System.out.println("Hello");
	}

}
