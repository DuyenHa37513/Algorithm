package org.example;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TwoSum_1 {
//    @Before
//    public void nums(){
//        Random rd = new Random();
//        int[] nums = new int[5];
//        for(int i = 0; i < nums.length; i++){
//            nums[i] = rd.nextInt();
//            System.out.println(nums);
//        }
//    }

        public static int[] sumTwo(int[] nums, int target){
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                int cur = nums[i];
                int x = target - cur;
                if(map.containsKey(x)){
                    return new int[] {map.get(x),i};
                }
                map.put(cur,i);
            }
            return null;
        }

    public static void main(String[] args) {
        int[] a = {3,4,6,6,4};
            System.out.println(Arrays.toString(sumTwo(a,8)));

        }

    }




//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.