/*
블랙잭
https://www.acmicpc.net/problem/2798
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        new Main().sol();
    }
    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] nums1 = br.readLine().split(" ");
            int cnt = Integer.parseInt(nums1[0]);
            int amt = Integer.parseInt(nums1[1]);
            int sum=0;
            String[] nums2 = br.readLine().split(" ");
            for (int i=0; i< cnt; i++){
                for(int j=0; j<cnt;j++){
                    if(j==i){
                        break;
                    }
                    for(int k=0; k<cnt;k++){
                        if(k==i||k==j){
                            break;
                        }
                        int a=Integer.parseInt(nums2[i]);
                        int b=Integer.parseInt(nums2[j]);
                        int c=Integer.parseInt(nums2[k]);

                        if(a + b + c <= amt && sum < a+b+c){
                            sum = a + b + c;
                        }
                    }
                }
            }
            bufferedWriter.write(sum+"");
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}