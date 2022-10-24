/*
https://www.acmicpc.net/problem/2525
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] hm = (br.readLine()).split(" ");
		String cook = br.readLine();
		
		int h = Integer.parseInt(hm[0]);
		int m = Integer.parseInt(hm[1]);
		int min = Integer.parseInt(cook);
		
		if(((m+min)/60) > 0) {
			h = h+((m+min)/60);
			m = (m+min)%60;
			if(h > 23) {
				h = h-24;
			}
			System.out.println(h+" "+m);
		}
		else {
			System.out.println(h+" "+(m+min));
		}
	}
}