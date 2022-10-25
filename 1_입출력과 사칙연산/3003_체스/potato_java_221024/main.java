/*
https://www.acmicpc.net/problem/3003
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = (br.readLine()).split(" ");
		
		int king = Integer.parseInt(input[0]);
		int queen = Integer.parseInt(input[1]);
		int rook = Integer.parseInt(input[2]);
		int bishop = Integer.parseInt(input[3]);
		int knight = Integer.parseInt(input[4]);
		int pawn = Integer.parseInt(input[5]);
		
		System.out.print(1-king+" ");
		System.out.print(1-queen+" ");
		System.out.print(2-rook+" ");
		System.out.print(2-bishop+" ");
		System.out.print(2-knight+" ");
		System.out.print(8-pawn);
	}
}