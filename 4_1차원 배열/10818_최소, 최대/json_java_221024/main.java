/*
최소, 최대
https://www.acmicpc.net/problem/10818
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
            int minAmt = 0;
            int maxAmt = 0;
            for (int i = 0; i < index; i++) {
                if (i == 0) {
                    minAmt = Integer.parseInt(nums[i]);
                    maxAmt = Integer.parseInt(nums[i]);
                } else {
                    if (minAmt > Integer.parseInt(nums[i])) {
                        minAmt = Integer.parseInt(nums[i]);
                    }
                    if (maxAmt < Integer.parseInt(nums[i])) {
                        maxAmt = Integer.parseInt(nums[i]);
                    }
                }
            }
            bufferedWriter.write(minAmt + " " + maxAmt);
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}