package practice01;

public class Prob5 {
	//숫자를 문자로보고 ,길이,포함글자 이용 
	public static void main(String[] args) {
		
		for(int i=1; i<100; i++){
			
			int cnt = 0;
			String num = String.valueOf(i);
			
			for(int j=0; j<num.length(); j++){
				if(num.charAt(j)=='3'||num.charAt(j)=='6'||num.charAt(j)=='9')
					cnt++;				
			}
			if(cnt==2)
				System.out.println(num+" 짝짝");
			else if(cnt==1)
				System.out.println(num+" 짝");

		}
	}//for(넘버 길이),글자하나하나 char c / charat()이용
}