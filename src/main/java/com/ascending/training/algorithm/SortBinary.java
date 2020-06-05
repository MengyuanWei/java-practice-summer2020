package com.ascending.training.algorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBinary{
    public static void main(String[] agrs){
        int target = 5;
        int[] nums = {2,3,5,7};
        System.out.println(binaryInsert(nums, target, 0, nums.length-1));
    }

    static int binaryInsert(int[] nums, int target, int start, int end){
        if(target <= nums[start]){
            return start;
        }

        if (target >= nums[end]){
            return end+1;
        }
        int midpoint = (start + end)/2;
        if(end - start <= 1){
            return end;
        }
        if(target < nums[midpoint]){
            return binaryInsert(nums, target, start, midpoint);
        } else{
            return binaryInsert(nums, target, midpoint, end);
        }
    }

    // log2(n), 二分法是log级别的
}