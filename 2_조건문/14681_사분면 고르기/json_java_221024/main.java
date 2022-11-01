/*
    사분면 고르기
https://www.acmicpc.net/problem/14681
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
            int b = Integer.parseInt(br.readLine());
            if (a > 0) {
                if (b > 0) {
                    System.out.println(1);
                } else if (b < 0) {
                    System.out.println(4);
                }
            } else if (a < 0) {
                if (b > 0) {
                    System.out.println(2);
                } else if (b < 0) {
                    System.out.println(3);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}