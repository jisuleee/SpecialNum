
import java.io.*;

public class perfectnum {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k,r,j;
		int lm = 0;
		int total ;
		
		for (n=4; n<=1000; n++) {
			
			 total = 0;
			 k = n/2;
			
			for(j =1 ; j <= k; j++) {
				
				 r = n % j;
				
				if(r ==0) {
					total += j;
					}
				
				}
			
			if(n == total) {				
				System.out.println(n+"�� ������");
				lm += 1;
			}
									
		   }
		
		System.out.println("�� �������� ������"+lm+"���̴�");
				
											
	}

}
