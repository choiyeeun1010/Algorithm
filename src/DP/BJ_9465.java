package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_9465 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){ // 테스트 케이스의 개수 만큼 반목
            int n = Integer.parseInt(br.readLine()); // 열의 개수
            int[][] arr = new int[2][n+1]; // 점수를 입력받을 배열
            int[][] dp = new int[2][n+1];

            // 점수 입력받기
            for(int j = 0; j < 2; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 1; k <= n; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            // 초기값 지정
            for(int j = 0; j < 2; j++){
                dp[j][1] = arr[j][1];
            }

            // 최대값 저장
            for(int j = 2; j <= n; j++){
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + arr[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + arr[1][j];
            }
            sb.append(Math.max(dp[0][n], dp[1][n])).append("\n");
        }
        System.out.println(sb);
    }
}