/*
https://www.acmicpc.net/problem/11021
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
		
		int[] ary = new int[cnt];
		for(int i=0; i<cnt; i++) {
			String[] str = (br.readLine()).split(" ");
			ary[i] = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
		}
		
		for(int i=0; i<ary.length; i++) {
			bw.write("Case #"+(i+1)+": "+ary[i]+"\n");
		}
		
		bw.close();
	}
}