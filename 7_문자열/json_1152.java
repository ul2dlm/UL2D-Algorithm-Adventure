/*
단어의 개수
https://www.acmicpc.net/problem/1152
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] num = br.readLine().split(" ");
            if (num.length > 1 && Objects.equals(num[0], "")) {
                bufferedWriter.write(num.length - 1 + "");
            } else {
                bufferedWriter.write(num.length + "");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}