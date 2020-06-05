package com.ascending.training.algorithm;

import java.util.Map;
import java.util.HashMap;
// For loop, while loop, recursive need to really think about time complexity 优化。

public class TwoSum{
    public static void main(String[] agrs){
        int target = 10;
        int[] nums = {2,4,6,9};

        for(int i: sumTwo(nums, target)){
            System.out.println(i);
        }

    }

    // Use hashmap to find the two elements' sum is the target value.
    // Reduce time complexity.
    static int[] sumTwo(int[] nums, int target){
        int res[] = {-1,-1};
        Map<Integer, Integer> map = new HashMap<>();  // 寻人启示

        for (int i = 0; i < nums.length; i++){
            map.put(target-nums[i], i);  	// 每个人进来之后都必须得登记寻人启示。(8, 0) (6, 1) (4, 2) (1, 3)
            if(map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);  // 进来之后，先看看有没有人在找我。
                res[1] = i;
                return res;
            }
        }
        return res;
    }


    // Time complexity比用map要更多，不是优化方法。
    // static int[] sumTwo(int[] nums, int target){
    // 	int[] res = {-1, -1};

    // 	for(int i = 0; i < nums.length-1; i++){
    // 		for (int j = i+1; j < nums.length; j++){
    // 			if(nums[i] + nums[j] == target){
    // 				res[0] = i;
    // 				res[1] = j;
    // 			}
    // 		}
    // 	}
    // 	return res;

    // }

}
