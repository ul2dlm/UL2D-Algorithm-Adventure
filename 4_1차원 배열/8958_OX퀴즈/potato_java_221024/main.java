/*
https://www.acmicpc.net/problem/8958
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			String[] str = (br.readLine()).split("");
			int sum = 0;
			int cnt = 0;
			for(int j=0; j<str.length; j++) {
				if(str[j].equals("O")) {
					cnt += 1;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}
}