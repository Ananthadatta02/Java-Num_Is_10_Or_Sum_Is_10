package test_27_03_25;

import java.util.Scanner;

public class Integers_10_Or_Sum_Is_10 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = s.nextInt();
		System.out.println("Enter the Second number");
		int b = s.nextInt();
		int sum = 0;
		if(a==10 || b==10 || a+b==10)
		{
			sum = a + b;
			System.out.println(sum*sum);
		}
	}
}
