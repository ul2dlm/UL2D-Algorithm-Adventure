/*
https://www.acmicpc.net/problem/18108
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int date = Integer.parseInt(input);
		date = date - 543;
		
		System.out.println(date);
	}
}