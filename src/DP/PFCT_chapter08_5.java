package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.Math;

public class PFCT_chapter08_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[m+1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = arr[i]; j <= m; j++){
                dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
            }
        }

        if(dp[m] == 10001)
            System.out.println(-1);
        else
            System.out.println(dp[m]);
        br.close();
    }
}