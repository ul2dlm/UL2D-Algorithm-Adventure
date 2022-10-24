/*
개수 세기
https://www.acmicpc.net/problem/10807
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
            int index = Integer.parseInt(br.readLine());
            String[] nums = br.readLine().split(" ");
            int findNum = Integer.parseInt(br.readLine());
            int findCnt = 0;
            for (int i = 0; i < index; i++) {
                if(Integer.parseInt(nums[i]) == findNum){
                    findCnt++;
                }
            }
            bufferedWriter.write(String.valueOf(findCnt));
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}