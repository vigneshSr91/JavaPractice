package com.java.tests;
import com.java.practice.kadanesAlgorithm;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class KadanesTests {
    @Test
    public void TestSolution(){
        kadanesAlgorithm cut = new kadanesAlgorithm();
        int[] inp = {-2,1,-3,4,-1,2,1,-5,4};
        ArrayList<Integer> inpt = new ArrayList<Integer>(inp.length);
        for(int i : inp){
            inpt.add(i);
        }
        int maxSum = cut.Solution( inpt );
        assertEquals(6, maxSum);
    }
}
