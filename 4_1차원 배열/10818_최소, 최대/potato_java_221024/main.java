/*
최소, 최대
https://www.acmicpc.net/problem/10818
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
		
		String n = br.readLine();
		String ary[] = (br.readLine()).split(" ");
		
		int min = 1000000;
		int max = -1000000;
		for(int i=0; i<Integer.parseInt(n); i++) {
			int num = Integer.parseInt(ary[i]);
			if(min > num) {
				min = num;
			}
			if(max < num) {
				max = num;
			}
		}
		
		bw.write(min+" "+max);
		bw.close();
	}
}