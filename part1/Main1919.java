package part1;

import java.util.Scanner;

public class Main1919 {
	
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++)
			count[str.charAt(i) - 'a']++;
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		
		int[] countA = getAlphabetCount(a);
		int[] countB = getAlphabetCount(b);
		
		int answer = 0;
		for(int i=0; i<26; i++)
			answer += Math.abs(countA[i] - countB[i]);
		System.out.println(answer);
	}
}