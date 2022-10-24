/*
최댓값
https://www.acmicpc.net/problem/2562
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

            int maxAmt = 0;
            int maxIdx = 1;
            for (int i = 1; i <= 9; i++) {
                int scanAmt = Integer.parseInt(br.readLine());
                if (i == 1) {
                    maxAmt = scanAmt;
                } else {
                    if (maxAmt < scanAmt) {
                        maxAmt = scanAmt;
                        maxIdx = i;
                    }
                }
            }
            bufferedWriter.write(maxAmt + "\n" + maxIdx);
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}