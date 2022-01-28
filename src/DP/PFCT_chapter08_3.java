package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.StringTokenizer;

public class PFCT_chapter08_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int[] dp = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 0;
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i = 2; i < num; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + arr[i]);
        }

        System.out.println(dp[num - 1]);
        br.close();
    }
}
