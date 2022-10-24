/*
두 수 비교하기
https://www.acmicpc.net/problem/1330
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
            if(a > b){
                System.out.println(">");
            }else if(a < b){
                System.out.println("<");
            }else{
                System.out.println("==");
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}