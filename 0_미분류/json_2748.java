/*
피보나치 수2
https://www.acmicpc.net/problem/2748
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(fibonacci(Integer.parseInt(br.readLine())) + "");
        bufferedWriter.flush();
    }
    public static long fibonacci(int n) {
        long left = 0;
        long right = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sum = right;
            } else {
                sum = left + right;
                left = right;
            }
            right = sum;
        }
        return sum;
    }
}