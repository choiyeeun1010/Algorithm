package JO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JO_1495 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력받기
        int[][] arr = new int[n][n]; // 결과

        int num = 1; // 행렬에 들어갈 숫자

        // 윗 삼각형
        for(int i = 0; i < n; i++){ // 대각선 방향으로 이동
            int j = 0;

            // 홀수
            if(i%2 != 0){
                for(int count = 0; count < i+1; count++){
                    arr[i-j][0+j] = num++;
                    j++;
                }
            // 짝수
            } else{
                for(int count = 0; count < i+1; count++){
                    arr[0+j][i-j] = num++;
                    j++;
                }
            }
        }

        // 아래 삼각형
        for(int i = 1; i < n; i++){
            int j = 0;
            if((i + n - 1) % 2 != 0){
                for(int count = i; count < n; count++){
                    arr[n-1-j][i+j] = num++;
                    j++;
                }
            }else{
                for(int count = i; count < n; count++){
                    arr[i+j][n-1-j] = num++;
                    j++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
