package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을를 입력하세요 : ");
		String text = scan.nextLine();
		//System.out.println(text);
		scan.close();
		
		int length=text.length();
		//char c = text.charAt(0);
		
		for(int i=0; i<length; i++){
			String result = "";
			
			for(int j=0; j<=i; j++){
				char c=text.charAt(j);
				result=result+c;
			}
			System.out.println(result);
		}
	}
}