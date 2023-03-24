package com.java.tests;
import com.java.practice.MaximumSumSubMatrix;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaximumSumSubmatrixTests {

    @Test
    public void testSolution(){
        MaximumSumSubMatrix cut = new MaximumSumSubMatrix();

        int input[][] = {{-6, -6}, {-29,-8}, {3, -8}, {-15, 2}, {25, 25}, {20, -5}};
        assertEquals( 65, cut.Solve(input) );
    }

}
