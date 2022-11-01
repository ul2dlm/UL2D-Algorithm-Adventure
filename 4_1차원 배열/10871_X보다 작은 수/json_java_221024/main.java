/*
X보다 작은 수
https://www.acmicpc.net/problem/10871
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
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] nums = br.readLine().split(" ");
            int index = Integer.parseInt(nums[0]);
            int cmpNum = Integer.parseInt(nums[1]);

            String[] nums2 = br.readLine().split(" ");
            for (int i = 0; i < index; i++) {
                if(Integer.parseInt(nums2[i]) < cmpNum){
                    bufferedWriter.write(nums2[i] + " ");
                }
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}