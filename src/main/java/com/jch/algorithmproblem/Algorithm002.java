package com.jch.algorithmproblem;

import java.util.Arrays;

/**
 * @Author: Mr.jia
 * @Date: 2019/3/9 12:13
 * 给定一个非空的整数数组，除了一个元素外，每个元素都会出现两次。 找到那个只出现了一次的元素。例如：
	输入：[2,2,1]
	输出：1
	输入：[4,1,2,1,2]
	输出：4
 */
public class Algorithm002 {

	public static void main(String[] args) {
		int[] array={1,2,2};
		int i = singleNumber2(array);
		System.out.println(i);
	}
	public static int singleNumber2(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count++;
			if (i + 1 == nums.length || nums[i] != nums[i + 1]) {
				if (count == 1) {
					return nums[i];
				}
				count = 0;
			}
		}
		return -1;
	}
}
