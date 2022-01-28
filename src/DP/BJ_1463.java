package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class BJ_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num+1];
        arr[0] = 0;
        arr[1] = 0;

        for(int i = 2; i <= num; i++){
            arr[i] = arr[i-1] + 1;
            if(i % 2 == 0)
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            if(i % 3 == 0)
                arr[i] = Math.min(arr[i], arr[i/3] + 1);
        }
        System.out.println(arr[num]);
        br.close();
    }
}
