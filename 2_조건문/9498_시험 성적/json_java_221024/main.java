/*
시험 성적
https://www.acmicpc.net/problem/9498
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int a = Integer.parseInt(br.readLine());
            if(a >= 90){
                System.out.println("A");
            }else if(a >= 80){
                System.out.println("B");
            }else if(a >= 70){
                System.out.println("C");
            }else if(a >= 60){
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}