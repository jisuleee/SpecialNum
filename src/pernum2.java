
import java.io.*;

public class pernum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,tot,k,r,j;
		int lm = 0;
	
		for(n=1; n<=100; n++) {
			tot = 0;
			k = n/2;
			
			for (j=1; j<=k; j++) {
				
				r = n % j;
				if(r==0) {
					tot += j;
				}
			}
			
			if(n==tot) {
			System.out.println(n+"은 완전수이다.");
			lm += 1;
			}
			
		}
		
		System.out.println("총 완전수의 개수는"+lm+"개 입니다.");
	}

}
