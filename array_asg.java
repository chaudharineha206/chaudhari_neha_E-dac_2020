//1	Write a program to print table of any entered number using loop.

/*
import java.util.*;
class Tableasg2
{
	public static void main(String args[])
	{
		int i ,n,table;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number   ...  ");	
		n=ob.nextInt();
		for(i=1;i<=10;i++)
		{	
			table=i*n;
			System.out.println(n+"x"+i+"="+table);	
		}
		
	}
}*/

//2.	Write a program to reverse a given number.
/*
import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int num,rev=0,rem;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number   ...  ");	
		num=ob.nextInt();
		while(num!=0)
		{
			rev=rev*10+rem;
			num=num/10;
			
		}System.out.print(""+rev);	
	}
}
*/

//3.	Program to check whether number is prime or not.
/*
import java.util.*;
public class prime
{    
	public static void main(String args[])
	{    
		int i,count=0,num;
		Scanner o= new Scanner(System.in);
		System.out.println("enter a number of ur choice  ");
		num=o.nextInt();
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==1)
		{
			System.out.println("number prime");
		}
		else
		{
			System.out.println("number not prime");
		}
	}    
}
*/
//4.	Calculate  series : 12+22+32+42+.........+n2
/*
import java.util.*;
public class pattern_no
{    
	public static void main(String args[])
	{    
		int num;
		Scanner o= new Scanner(System.in);
		System.out.println("enter a number of ur choice  ");
		num=o.nextInt();
		for(int i=1;i<=10;i++)
		{
			num=num+10;
			System.out.print(" "+num);
		
		}
		
	}
}	
*/
//5.Print all prime numbers between two given numbers. [ break continue ]
/*
import java.util.*;
public class prime01
{    
	public static void main(String args[])
	{    
		int i,num1,num2,num;
		Scanner o= new Scanner(System.in);
		System.out.println("enter a number of ur choice  ");
		num1=o.nextInt();
		System.out.println("enter a number of ur choice  ");
		num2=o.nextInt();
		for(num=num1;num<=num2;num++)
			{
				for(i=2;i<=num;i++)
				{
					if(num%i==0)			
						break;
				}
				if(i==num)
				{
					System.out.println("number "+num);
				}
			}
	}    
}
*/
//6.	Program to show sum and average of 10 element array. Accept array elements from user. 
/*
import java.util.*;
class Arr_avg{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements  ");
		
		int arr[]=new int[10],sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum is "+sum);
		
	}
}
*/
//7.	Sort a ten element array in descending order.
/*
import java.util.*;
class array_1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("no.");
		int n=sc.nextInt();		
		int arr[]=new int[n];
		//int arr[]={1,2,3,4};
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("");

		for(int i=0;i<arr.length;i++)		
		{
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("");

		
		for(int i=0;i<arr.length;i++)			
		{			
			int temp=0;							
			for(int j=0;j<arr.length-i-1;j++)
			{		

				if(arr[j]<=arr[j+1])
				{		
	 				temp=arr[j];				
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		
			System.out.println("");
			System.out.println("descending order");

		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
	
}
*/
//8.	Write a program to reverse the array elements.
/*
import java.util.*;
class array_1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int n=sc.nextInt();		
		int arr[]=new int[n];
		int arr1[]=new int[n]; 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array 1 elements");
		for(int i=0;i<arr.length;i++)		
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("reverse array ");
		for(int i=arr.length-1  ; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
*/
//9.	Write a program to search an element in the array.
/*
import java.util.*;
class array_1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int a,count=0;
		int n=sc.nextInt();		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array 1 elements");
		for(int i=0;i<arr.length;i++)		
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Enter number");
		a=sc.nextInt();
		for(int i=0;i<arr.length;i++)		
		{
			if(a==arr[i])
			{
				System.out.println("number found at "+ i + "position ");
				break;
			}
			else
			{	count++;
			}
		}
		if(count == arr.length)
		{
			System.out.println("number not found ");			
		}
	}
}
*/
//10.	Write the program to find the sum of even elements and sum of odd 
//		elements present in the array of integer type.
/*
import java.util.*;
class array_1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int sum=0,sum1=0;
		int n=sc.nextInt();		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array 1 elements");
		
		for(int i=0;i<arr.length;i++)		
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)		
		{	
			sum+=arr[i];
			i++;
		}
		System.out.println("");
		System.out.println("addition is"+sum);
		for(int i=1;i<arr.length;i++)		
		{	
			sum1+=arr[i];
			i++;
		}System.out.println("addition is"+sum1);
	}
}
*/