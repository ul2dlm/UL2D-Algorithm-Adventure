/*
최댓값
https://www.acmicpc.net/problem/2562
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] ary = new int[9];
		int max = 0;
		int index = 0;
		for(int i=0; i<ary.length; i++) {
			ary[i] = Integer.parseInt(br.readLine());
			if(max < ary[i]) {
				max = ary[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}