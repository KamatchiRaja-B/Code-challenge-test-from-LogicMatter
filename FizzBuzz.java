package javaProgram;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		fizzBuzzLogic(start, end);
		scan.close();
	}
	
	public static void fizzBuzzLogic(int start, int end) {
		for(int i=start;i<=end;i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print("FizzBuzz, ");
			}
			else if(i%3 == 0) {
				System.out.print("Fizz, ");
			}
			else if(i%5 == 0) {
				System.out.print("Buzz, ");
			}
			else {
				System.out.print(i + ", ");
			}
		}
	}
}
