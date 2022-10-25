/*
https://www.acmicpc.net/problem/2480
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = (br.readLine()).split(" ");
		
		int A = Integer.parseInt(num[0]);
		int B = Integer.parseInt(num[1]);
		int C = Integer.parseInt(num[2]);

		int n = 0;
		if(A==B && B==C) {
			n = A;
			System.out.println(10000+n*1000);
		}
		else if(A==B || B==C || C==A){
			if(A==B) {
				n = A;
			}
			else if(B==C) {
				n = B;
			}
			else if(C==A) {
				n = C;
			}
			System.out.println(1000+n*100);
		}
		else {
			int ary[] = {A,B,C};
			int temp = 0;
			for(int i=0; i<ary.length; i++) {
				for(int j=i+1; j<ary.length; j++) {
					if(ary[i] > ary[j]) {
						temp = ary[i];
						ary[i] = ary[j];
						ary[j] = temp;
					}
				}
			}
			n = ary[2];
			System.out.println(n*100);
		}
	}
}