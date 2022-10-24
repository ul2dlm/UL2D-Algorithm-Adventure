/*
A+B
https://www.acmicpc.net/problem/1000
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] nums=  br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a+b);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}