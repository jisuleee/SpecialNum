import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.*;


public class pibonachi {

 public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub

		int a = 1;
		int b = 1;
		int y = 2;
		int c;
		int x[] = new int[500];
		x[0]= 1; 
		x[1]= 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("항수 입력>");
		int n = Integer.parseInt(br.readLine());
		
		for(int k=3; k<=n ; k++){
			c = a + b;
			y += c;
			a = b;	
			b = c;
			
			x[k-1] =c;
		}
		
		/*System.out.print(x[0]);
		
		for(int i=1; i<=n; i++) {
			
			System.out.print("+"+x[i]);		
			if(i == n-1) {
				System.out.print("="+ y);	
			}		
			}*/
		System.out.print(y+"=");
		for (int i=0; i<=n-2; i++) {
					
			System.out.print(x[i]+"+");
		
		}
		System.out.print(x[n-1]);
 		}
		
 
}


