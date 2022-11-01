/*
   알람 시계
https://www.acmicpc.net/problem/2884
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] HM = (br.readLine()).split(" ");
		
		int H = Integer.parseInt(HM[0]);
		int M = Integer.parseInt(HM[1]);
		
		if(M >= 45) {
			System.out.println(H+" "+(M-45));
		}
		else {
			if(H > 0) {
				System.out.println((H-1)+" "+(60-(45-M)));
			}
			else {
				System.out.println(23+" "+(60-(45-M)));
			}
		}
	}
}