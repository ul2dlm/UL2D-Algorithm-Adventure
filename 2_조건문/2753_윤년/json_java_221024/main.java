/*
    윤년
https://www.acmicpc.net/problem/2753
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
            if (a % 4 == 0) {
                if (a % 400 == 0) {
                    System.out.println(1);
                } else if (a % 100 != 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(0);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}