// Q1	Write a program to print Hello World. Compile and run it using command prompt.

/*
import java.util.*;
class Hello1
{
	public static void main(String args[])
		{
		System.out.println("Hello World  !!!");
		}
}		 */

//Q2	02.	Write a program to declare a variable named rollNo of integer type. Assign it a value 
//		(let say 100) to it and print the following statement roll no = 100 .
/*
import java.util.*;
class Roll_no
{
	public static void main(String args[])
		{
			int roll_no;
			roll_no=100;
			System.out.println("roll no = "+ roll_no);
		}
}	
*/
//03.	Find the result of following expressions. You need to determine the primitive data type of the 
//		variable by looking carefully the given expression and initialize variables by any random value.
//		A. y = x2 + 3x - 7 (print value of y) 
//		B. y = x++ + ++x (print value of x and y) 
//		C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
//		D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
/*
import java.util.*;
class Exp
{
	public static void main(String args[])
		{
			int x,y,z,a,b,c,d,g,h;
			Scanner ob=new Scanner(System.in);
			System.out.println("enter value of x,y,z= ");
			x=ob.nextInt();
			y=ob.nextInt();
			z=ob.nextInt();
			g=x;d=x;h=y;
			
			a=x*x+3*x-7;
			b=x++ + ++x ;
						
			System.out.println("	A. y = x2 + 3x - 7   >>>>  y="+a);
			
			System.out.println("	B.");
			x=d;
			System.out.println("	x++  ="+(x++));
			System.out.println("	++x  ="+(++x));
			System.out.println(" 	y = x++ + ++x	>>>>	y="+b);
			
			System.out.println("	C.");
			x=g;
			
			System.out.println("	x++  ="+(x++));
			System.out.println("	++x  ="+(++x));
			System.out.println("	--y	 ="+(--y));
			y=h;
			c=x++ - --y - --x  +  x++;
			System.out.println("	z = x++ - --y - --x  +  x++	>>>>	z="+c);
			boolean p=false,q=false,r=false;
			r = (p && q || !(p || q));
			System.out.println("	D. r = p && q || !(p || q)  ="+r);
			
		}
}		
*/		
		
//Q4.	Write a program that initializes 2 byte type of variables. Add the values of these variables 
//		and store in a byte type of variable. [Note: primitive down casting is required in this program].
/*
import java.util.*;
class Var
{
	public static void main(String args[])
		{
			short var1=10,var2=5;
			int c=var1+var2;
			System.out.println("addition is = "+c);
		}
}
*/

//Q5	Write a program that takes user’s name as command line argument & prints Welcome
//		<entered user name>.
/*
import java.util.*;
class User
{
	public static void main(String args[])
		{
			String name;
			Scanner ob=new Scanner(System.in);
			System.out.println("enter name = ");
			name=ob.next();
			System.out.println(" WELCOME "+name);
		}
}
*/
//Q6	Write a program that takes radius of a circle as input.Read the entered radius using
//		Scanner class. Then calculate and print the area and circumference of the circle.
/*
import java.util.*;
class AreaC
{
	public static void main(String args[])
		{
			int r;
			double area,cir,pi=3.14;
			Scanner o=new Scanner(System.in);
			System.out.println(" Enter radius of circle =");
			r=o.nextInt();
			area=pi*r*r;
			cir=2*pi*r;
			System.out.println(" Area of circle is		"+area);
			System.out.println(" Circumference of circle is		"+cir);
		}
}
*/
//07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
//		Take the obtained marks from user using Scanner class. Output should be in
//		this format [ percentage marks = 99 % ]. Use concatenation operator here.
/*
import java.util.*;

class Constructor{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int sum=0,div=0,i,j=1;
		double per;
		Scanner o=new Scanner(System.in);
		System.out.println("enter 5 subject marks ");
		
		for(i=0;i<arr.length;i++,j++)
		{	System.out.println("enter marks of subject  "+j);
			arr[i]=o.nextInt();
			System.out.println(+j+"  sub marks "+arr[i]);
			sum=sum+arr[i];
			
		}
		per=(sum/5);
		System.out.println("sum of all subect marks is"+sum);
		System.out.println("		PERCENT IS "+per +"%");
	}
}
*/	
//08.	Write a program to find the simple interest. 
//		Take the principle amount, rate of interest 
//		and time from user using Scanner class.
/*
import java.util.*;
class SimpleI{
	public static void main(String args []){
		double s_interest,pamount,rate,time;
		Scanner o=new Scanner(System.in);
		System.out.println("enter interest,pamount,rate,time");
		s_interest=o.nextDouble();
		pamount=o.nextDouble();
		rate=o.nextDouble();
		time=o.nextDouble();
		s_interest=((pamount*time*rate)/100);
		System.out.println("simple interest is "+s_interest);
		
	}
}
*/
//	09.	Write a program to read the days (eg. 670 days) as 
//	integer value using Scanner class. Now convert the entered
//	days into complete years, months and days and print them.
/*
import java.util.*;
class Year{
	public static void main(String args []){
		int days,m,years=0,month;
		Scanner o=new Scanner(System.in);
		System.out.println("enter number of days  =");
        	days=o.nextInt();
			years=days/365;
			m=days%365;
			month=m/30;
			days=m%30;
		System.out.println("years are "+years);
		System.out.println("months are "+month);
		System.out.println("days are "+days);
		
	}
}
*/

//	10.	Write a program to convert temperature from Fahrenheit to 
//	Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
/*
import java.util.*;
class F2C
{
	public static void main(String args[])
	{
		double cel,fah;
		Scanner o=new Scanner(System.in);
		System.out.println("enter fah ... >> ");
		fah=o.nextDouble();
		
		cel= 5*(fah-32)/9;
		System.out.println(" The celsius to fahrenheit is ...>> "+cel);
	}
}
*/

//Q11.	Write a program to swap two numbers without using third variable.
/*
import java.util.*;
class Swap2
{
	public static void main(String args[])
		{
			int x,y;
			Scanner o=new Scanner(System.in);
			System.out.println("  enter value of x and y  :-  ");
			x=o.nextInt();
			y=o.nextInt();
			System.out.println("      value of x "+x+ "      value of y "+y);
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("      value of x "+x+ "      value of y "+y);
		}
}
*/

//12.	In a company an employee is paid as under: If his basic salary is less 
//		than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
//		If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and 
//		DA = 98% of basic salary. If the employee's salary is input by the user 
//		write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
/*
import java.util.*;
class BasicS
{
	public static void main(String args[])
		{
			double basics,hra,da,a,gs;
			Scanner o=new Scanner(System.in);
			System.out.println("  enter salary  .... ");
			basics=o.nextInt();
			if(basics<10000)
			{
				hra=basics/10;
				da=basics-hra;
				gs=basics+da+hra;
				System.out.println("	Gross Salary is   .... "+gs);
			}
			else if(basics>=10000)
			{
				hra=2000;
				a=basics/100;
				da=(basics-(2*a))+basics;
				gs=basics+da+hra;		
				System.out.println("	Gross Salary is   .... "+gs);
			}
		}
}
*/
//	13.	Program to find greatest in 3 numbers. [ once using if else 
//		statement and then using ternary operator ( logical operator) ]  
/*
import java.util.*;
class Greatest3
{
	public static void main(String args[])
	{
		int a,b,c,p;
		Scanner o=new Scanner(System.in);
		System.out.println("Enter three numbers  ...  ");
		a=o.nextInt();
		b=o.nextInt();
		c=o.nextInt();
		
		p=a>b?(a>c?a:c):(b>c?b:c); 
		
		System.out.println("greatest number is "+p);
		
		///////..........
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("greatest number is "+a);
			}
			else{
					System.out.println("greatest number is "+c);
				}
		}
		else if(b>c)
			{
				System.out.println("greatest number is "+b);
			}
			else
			{
				System.out.println("greatest number is "+c);
			}	
	}
}
*/
//14.	Program to check that entered year is a leap year or not.
/*
import java.util.*;
class Leap
{
	public static void main(String args [])
	{
		int days,m,years=0,month,d=1;
		Scanner o=new Scanner(System.in);
		System.out.println("enter number of days  =");
        	days=o.nextInt();
			years=days/365;
			m=days%365;
			month=m/30;
			days=m%30;
			if(d==m%29)
			{
				System.out.println("Leap Year "+d);
			}
		System.out.println("years are "+years);
	}
}
*/
//15.	Accept person’s gender (character m for male and f for female), 
//		age (integer), as input and then check whether person is eligible 
//		for marriage or not.
/*
import java.util.*;
class Marriage
{
	public static void main(String args[])
	{
		int age;
		char gender,m;
		String c,a="eligible",b="not eligible";
		
		Scanner sc=new Scanner(System.in);

		System.out.println("   Enter Gender...(m/f)  ");
		
		gender=sc.next().charAt(0);
		
		System.out.println("   Enter age...  ");
		
		age=sc.nextInt();
		
		c=(gender=='m'?(age>=21?a:b):(age>=18?a:b));
		System.out.println("Person is "+c);
		
	}
}
*/
