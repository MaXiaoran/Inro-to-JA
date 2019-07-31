//判断是否是素数

package prime;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 0;
		for ( int i = 2; i<n; i++)
		{
			if ( n % i == 0 )
			{
				System.out .print(n + "不是素数");
			}
			if ( isPrime == 1)
			{
				System.out.println( n + " is a prime");
			}
			else
			{
				System.out.println( n + " is not a prime");
			}
		}
	}
}
