package EX_Day10_Lab__no_5;

public class EX_Array__sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
						/*
						 * 배열 정렬 
						 * 오름차순 또는 내림차순 정렬하기/
						 *[]
						 */
		
		
//					int [] num = {3,2,1,5,4};
//					int min=0;
//					
//					for (int i=0;i<num.length;i++) {
//						for (int j=1;j<nu;j++) {
//							
//							
//						}
//							
//						}
							/*
							 * 오름차순 정렬 (작은>큰수) 내림차순(큰>작)
							 * /				
							 */
					int [] num = {3,2,1,5,4};
					int temp = 0;
					
					//정렬 하기 전 배열 값 확인..
					for (int i=0;i<num.length;i++) {
						System.out.println(num[i]);
					}
					
					
					
					for (int i=0;i<num.length;i++) {
						for(int j=i+1;j<num.length;j++) {
							if(num[i]>num[j]) {
								temp = num[i];
								num[i]= num[j];
								num[j]= temp;
							}
						}
					}
						// 정렬 후 배열값 확인.
						for (int i=0;i<num.length;i++) {
							System.out.println("배열완료 : " + num[i] );
						}
	
	
	
	
	
	
	
	
	
	
	}

}
