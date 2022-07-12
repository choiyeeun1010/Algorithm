package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class emptyRoom {
    public static void main(String[] args) throws IOException{
        int[][] customer = {{2, 1}, {1, 1}, {3, 1}, {1, 0}, {1, 1}, {2, 0}, {2, 1}};
        int k = 1;
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> waiting = new LinkedList<>();

        for(int i = 0; i < customer.length; i++){
            if (customer[i][1] == 1){
                if(result.size() < k){
                    result.add(customer[i][0]);
                }else{
                    waiting.add(customer[i][0]);
                }
            }else{
                if (result.contains(customer[i][0])){
                    result.remove(Integer.valueOf(customer[i][0]));
                    result.add(waiting.peek());
                    waiting.remove();
                }else{
                    waiting.remove(Integer.valueOf(customer[i][0]));
                }
            }
        }

        System.out.println(result);

    }
}
