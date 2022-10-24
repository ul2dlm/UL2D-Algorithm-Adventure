/*
X보다 작은 수
https://www.acmicpc.net/problem/10871
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
		
		String[] str = (br.readLine()).split(" ");
		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		
		String[] number = (br.readLine()).split(" ");
		for(int i=0; i<n; i++) {
			bw.write(Integer.parseInt(number[i]) < x ? number[i]+" " : "");
		}
		bw.close();
	}
}