/*
    사분면 고르기
https://www.acmicpc.net/problem/14681
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine();
		String Y = br.readLine();
		
		int x = Integer.parseInt(X);
		int y = Integer.parseInt(Y);
		
		if(x > 0 && y > 0) {
			System.out.println(1);
		}
		else if(x > 0 && y < 0) {
			System.out.println(4);
		}
		else if(x < 0 && y > 0) {
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
	}
}