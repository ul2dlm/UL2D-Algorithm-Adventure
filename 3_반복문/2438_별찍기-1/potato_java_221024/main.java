/*
https://www.acmicpc.net/problem/2438
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
			for(int j=0; j<i+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.close();
	}
}