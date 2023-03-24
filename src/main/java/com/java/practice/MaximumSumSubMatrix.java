package com.java.practice;
import java.util.Arrays;

import static java.lang.Math.*;

// import static java.lang.Math.max;

/*
    Using Prefix Sum, Kadane's Algorithm
 */
public class MaximumSumSubMatrix {
    public int Solve(int[][] arr){
        int current = 0;
        int N = arr.length;
        int M = arr[0].length;
        int[] temp = new int[N];

        int answer = Integer.MIN_VALUE;
        for(int k=0; k<M; k++) {
            Arrays.fill(temp, 0);
            for (int j=k; j < M; j++) {
                for (int i = 0; i < N; i++) {
                    temp[i] = temp[i] + arr[i][j];
                }
                int tempAnswer = kadanes(temp);
                if (answer < tempAnswer) {
                    answer = tempAnswer;
                }
            }
        }
        return answer;
    }

    static int kadanes(int[] arr){
        int current = 0;
        int maxim = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            current += arr[i];
            maxim = max(maxim, current);
            if(current < 0){
                current = 0;
            }
        }
        return maxim;
    }
}
