/*
크로아티아 알파벳
https://www.acmicpc.net/problem/2941
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
            String input = br.readLine();
            String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
            for (String word : cro) {
                input = input.replaceAll(word, ",");
            }
            bufferedWriter.write(input.length() + "");
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}