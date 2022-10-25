/*
    윤년
https://www.acmicpc.net/problem/2753
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int year = Integer.parseInt(str);
		
		if((year % 4 == 0 && year % 100 != 0) || year%400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}