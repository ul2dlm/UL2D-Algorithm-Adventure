/*
https://www.acmicpc.net/problem/2588
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		String[] array = B.split("");
		
		int a = Integer.parseInt(A);
		int b100 = Integer.parseInt(array[0])*100;
		int b10 = Integer.parseInt(array[1])*10;
		int b1 = Integer.parseInt(array[2]);
		int b = Integer.parseInt(B);
		
		System.out.println(a*b1);
		System.out.println((a*b10)/10);
		System.out.println((a*b100)/100);
		System.out.println(a*b);
		
	}
}