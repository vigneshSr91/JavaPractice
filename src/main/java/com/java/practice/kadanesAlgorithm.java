package com.java.practice;

import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class kadanesAlgorithm {
    public static int Solution(ArrayList<Integer> arr){
        /*
        Kadane's algorithm is used to calculate the maximum sub-array sum
         */
        int answer = Integer.MIN_VALUE;
        int temp = 0;

        for(int i=0; i< arr.size(); i++){
            temp += arr.get(i);
            answer = max(answer,temp);
            if(temp < 0){
                temp = 0;
            }
        }

        return answer;
    }
}
