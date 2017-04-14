package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		
			int sum=0;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자를 입력하시오 : ");
			int number = scan.nextInt();
			scan.close();
			
			if(number%2==0){//짝수
				for(int i=0; i<=number; i=i+2){
					sum=sum+i;	
				}
				System.out.println("결과 값 : "+sum);
			}
			else{
				for(int i=1; i<=number; i=i+2){
					sum=sum+i;
				}
				System.out.println("결과 값 : "+sum);
			}
				
	}
}
