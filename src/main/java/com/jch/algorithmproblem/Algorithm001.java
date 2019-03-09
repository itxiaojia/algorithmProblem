package com.jch.algorithmproblem;

import java.util.Arrays;

/**
 * @Author: Mr.jia
 * @Date: 2019/3/9 12:02
 * 给定两个字符串s和t，写一个函数来确定t是否是s的anagram。例如：
	输入：s =“anagram”，t =“nagaram”
	输出：true

	输入：s =“rat”，t =“car”
	输出：false
 */
public class Algorithm001 {

	public static void main(String[] args) {

		boolean anagram = isAnagram("afaefj", "afaefj");
		System.out.println(anagram);
	}

	public static boolean isAnagram(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		char[] ch = s.toCharArray();
		char[] ch2 = t.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		return Arrays.equals(ch, ch2);
	}
}
