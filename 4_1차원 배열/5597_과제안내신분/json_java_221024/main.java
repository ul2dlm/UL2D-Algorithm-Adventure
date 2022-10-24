/*
과제 안 내신 분..?
https://www.acmicpc.net/problem/5597
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

            ArrayList<Integer> studentList = new ArrayList<>();
            for (int i = 1; i <= 30; i++) {
                studentList.add(i);
            }

            for (int i = 1; i <= 28; i++) {
                int scanAmt = Integer.parseInt(br.readLine());
                studentList.remove((Integer) scanAmt);
            }
            for (Integer integer : studentList) {
                bufferedWriter.write(integer + "\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}