/*
사칙연산
https://www.acmicpc.net/problem/10869
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            bufferedWriter.write(a + b+"\n");
            bufferedWriter.write(a - b+"\n");
            bufferedWriter.write(a * b+"\n");
            bufferedWriter.write( (int) Math.floor(a / b) +"\n");
            bufferedWriter.write(String.valueOf(a % b));
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}