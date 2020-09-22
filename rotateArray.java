import java.util.*;
public class rotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rotations to be made:");
		int r=sc.nextInt();
		System.out.println("Enter the no.of elements you want to insert in the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<r;i++)
		{
			int temp,j;
			temp=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.println();
		System.out.println("Array after left rotation:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		}
			

	}


