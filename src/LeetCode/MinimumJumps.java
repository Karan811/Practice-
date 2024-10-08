package LeetCode;

import java.net.SocketOption;
import java.util.Collections;

public class MinimumJumps {

    public static void main(String args[]){
        int[] arr = {8, 3, 27, 13, 13};
        int res= MinimumJumps.minJumps(arr,11);
        System.out.println("minimum jumps -"+res);
    }
    static int minJumps(int[] arr, int n) {

        int result = 0;
        int i=0;
        while(i < arr.length) {
            if (arr[i] == 0) {
                return -1;
            }else
            if (arr[i] < arr.length) {
                i = i+arr[i];
                result++;
            } else {
                result++;
                break;
            }
        }
        return result;
    }
}
