/*
빠른 A+B
https://www.acmicpc.net/problem/15552
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
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		int result[] = new int[num];
		
		for(int i=0; i<num; i++) {
			String string[] = (br.readLine()).split(" ");
			result[i] = Integer.parseInt(string[0])+Integer.parseInt(string[1]);
		}
		
		for(int i=0; i<result.length; i++) {
			bw.write(result[i]+"\n");
		}
		
		bw.close();
	}
}