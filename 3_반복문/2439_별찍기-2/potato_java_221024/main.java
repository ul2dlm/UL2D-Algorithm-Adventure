/*
https://www.acmicpc.net/problem/2439
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
		
		int num = 0;
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt-1-i; j++) {
				bw.write(" ");
				num++;
			}
			for(int h=0; h<cnt-num; h++) {
				bw.write("*");
			}
			num = 0;
			bw.write("\n");
		}
		
		bw.close();
	}
}