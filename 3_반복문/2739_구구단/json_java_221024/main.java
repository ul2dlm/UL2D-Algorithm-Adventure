/*
   구구단
https://www.acmicpc.net/problem/2739
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            for(int i=1; i <= 9; i++){
                System.out.println(a + " * " + i +" = "+ (a*i));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}