/*
빠른 A+B
https://www.acmicpc.net/problem/15552
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {

        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int index= Integer.parseInt(br.readLine());
            for(int i=0; i < index; i++){
                String[] nums=  br.readLine().split(" ");
                int a = Integer.parseInt(nums[0]);
                int b = Integer.parseInt(nums[1]);
                bufferedWriter.write(String.valueOf(a + b)+"\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}