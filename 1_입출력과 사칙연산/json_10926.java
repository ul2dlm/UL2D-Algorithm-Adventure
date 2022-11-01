/*
??!
https://www.acmicpc.net/problem/10926
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
            String str = br.readLine();
            bufferedWriter.write(str + "??!");
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}