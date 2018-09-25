package ariketa1;

import java.util.Scanner;

public class Ariketa1 {
	public static void main(String args[])
	{
		Scanner miScanner = new Scanner(System.in);
		int n = 0;
		int num;
		while (n < 100) {
			System.out.println("Enter a number: ");
			num = miScanner.nextInt();
			n += num + n;
			}
		}
	}
