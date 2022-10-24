/*
영수증
https://www.acmicpc.net/problem/25304
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
            int totalAmt = Integer.parseInt(br.readLine());
            int cnt= Integer.parseInt(br.readLine());
            int sumAmt=0;
            for(int i=0; i < cnt; i++){
                String[] nums=  br.readLine().split(" ");
                int a = Integer.parseInt(nums[0]);
                int b = Integer.parseInt(nums[1]);
                sumAmt += a * b;
            }
            System.out.println(totalAmt==sumAmt ? "Yes" : "No");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}