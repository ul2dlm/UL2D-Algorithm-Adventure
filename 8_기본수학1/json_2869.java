/*
달팽이는 올라가고 싶다
https://www.acmicpc.net/problem/2869
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] nums = br.readLine().split(" ");
            int start = 0;
            int days = 0;
            int up = Integer.parseInt(nums[0]);
            int down = Integer.parseInt(nums[1]);
            int height = Integer.parseInt(nums[2]);
            days =  (height - down) / (up - down);
            if((height - down) % (up - down) > 0){
                days++;
            }
            bufferedWriter.write(days+"");
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}