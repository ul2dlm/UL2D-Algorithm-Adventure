/*
https://www.acmicpc.net/problem/11022
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = br.readLine();
		int cnt = Integer.parseInt(string);
		
		for(int i=0; i<cnt; i++) {
			String[] str = (br.readLine()).split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int sum = a+b;
			bw.write("Case #"+(i+1)+": "+a+" + "+b+" = "+sum+"\n");
		}
		
		bw.close();
	}
}