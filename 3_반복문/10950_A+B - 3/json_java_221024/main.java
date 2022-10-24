/*
A+B - 3
https://www.acmicpc.net/problem/10950
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
            int index= Integer.parseInt(br.readLine());
            for(int i=0; i < index; i++){
                String[] nums=  br.readLine().split(" ");
                int a = Integer.parseInt(nums[0]);
                int b = Integer.parseInt(nums[1]);
                System.out.println(a+b);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}