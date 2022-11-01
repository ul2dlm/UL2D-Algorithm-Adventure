/*
https://www.acmicpc.net/problem/4344
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String string = br.readLine();
		int tc = Integer.parseInt(string);
		
		for(int i=0; i<tc; i++) {
			String[] c = (br.readLine()).split(" ");
			double avg = 0;
			double std = Integer.parseInt(c[0]);
			for(int j=0; j<std; j++) {
				avg += Integer.parseInt(c[j+1]); 
			}
			avg = avg/std;
			
			double cnt = 0;
			for(int j=0; j<std; j++) {
				if(Integer.parseInt(c[j+1]) > avg) {
					cnt++;
				}
			}
			
			System.out.println(String.format("%.3f", cnt/std*100)+"%");
			avg = 0;
			cnt = 0;
		}
	}
}