package EX_Day10_Lab__no_04;

import java.util.Scanner;

public class EX_Arraycoin {

	public static void main(String[] args) {
			// 
			
			int[] coin = {500,100,50,10};
			 // 거스름돈 계산하기 
			Scanner scan =new Scanner(System.in);
			System.out.println("금액 입력 : ");
			int change =scan.nextInt();
			
			for (int i =0;i<coin.length;i++) {
				//동전의 갯수 출력
				int coincount =change/coin[i];
				System.out.println(coin[i]+"원 동전 :" +coincount+ "개");
					// 나머지 값을 사용하기 위한 식 
				change = change % coin[i];
			}
			
			
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
