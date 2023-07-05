package part1;

import java.util.Scanner;

public class Main2744 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
//		String result = "";
//		
//		for(char stArray : str.toCharArray()) {
//			if(Character.isUpperCase(stArray)) {
//				result += Character.toLowerCase(stArray);
//			} else if(Character.isLowerCase(stArray)) {
//				result += Character.toUpperCase(stArray);
//			}
//		}
//		System.out.println(result);
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if('A' <= ch && ch <= 'Z')
				System.out.print((char)('a' + ch - 'A'));
			else System.out.print((char)('A' + ch - 'a'));
		}
	}
}