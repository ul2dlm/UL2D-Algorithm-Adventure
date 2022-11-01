/*
피보나치 함수
https://www.acmicpc.net/problem/1003
*/
import java.io.*;

public class Main {
    static Integer[][] arr = new Integer[41][2];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(br.readLine());
            fibonacci(num);
            bufferedWriter.write(arr[num][0] + " " + arr[num][1] + "\n");
        }
        bufferedWriter.flush();

    }

    static Integer[] fibonacci(int n) {
        if (arr[n][0] == null || arr[n][1] == null) {
            arr[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            arr[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return arr[n];
    }
}
