package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class zigzag {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];
        int num = 1;

        for(int i = 0; i < n; i++){
            int j = 0;
            if(i % 2 == 0){
                for(int count = 0; count < i+1; count++){
                    arr[i-j][j] = num++;
                    j++;
                }
            }else{
                for(int count = 0; count < i+1; count++){
                    arr[j][i-j] =num++;
                    j++;
                }
            }
        }

        for(int i = 1; i < n; i++){
            int j = 0;
            if((i+n-1) % 2 == 0){
                for(int count = 0; count < n - i; count ++){
                    arr[n-j-1][j+1] = num++;
                    j++;
                }
            }else{
                for(int count = 0; count < n - i; count++){
                    arr[j+1][n-j-1] = num++;
                    j++;
                }
            }
        }

        System.out.println(arr[r-1][c-1]);
    }
}
