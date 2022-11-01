/*
   알람 시계
https://www.acmicpc.net/problem/2884
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
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            if (b - 45 >= 0) {
                System.out.println(a + " " + (b - 45));
            } else {
                if ((a - 1) >= 0) {
                    System.out.println(a - 1 + " " + (15 + b));
                } else {
                    System.out.println(23 + " " + (15 + b));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}