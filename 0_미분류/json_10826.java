/*
피보나치 수4
https://www.acmicpc.net/problem/10826
*/
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(fibonacci(Integer.parseInt(br.readLine())) + "");
        bufferedWriter.flush();
    }
    public static BigInteger fibonacci(int n) {
        BigInteger left = BigInteger.ZERO;
        BigInteger right = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sum = right;
            } else {
                sum =  left.add(right);
                left = right;
            }
            right = sum;
        }
        return sum;
    }
}