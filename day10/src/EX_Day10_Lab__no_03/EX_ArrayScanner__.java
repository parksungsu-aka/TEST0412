package EX_Day10_Lab__no_03;

import java.util.Scanner;

public class EX_ArrayScanner__ {

	public static void main(String[] args) {
		
		/*
		 * 숫자 입력은 한번
		 * for 문 이용!!
		 * 입력받을 숫자.../
		 */
		
		
		

		Scanner scan = new Scanner(System.in);
		int number =0;		
		int num [] = {5,2,1,3,4,7,6,9,10,8};
			System.out.println("숫자 입력 : ");
			number=scan.nextInt();
			for (int i=0;i<num.length;i++) {  	 //입력받은 숫자와 배열에 있는 값을 하나하나 같은지 비교!!
				if(number == num[i]) {
					System.out.println(number+"는"+i+"번 인덱스에 있습니다.");
				}
			}
			
		
			
			
			
		
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
