package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {

		//TC - Big O(n)
		
		int i = 1;//1 --> O(1)
		int k = 10;//1
		
		//O(2)
		//constant time: O(1)
		
		
		for(int j=1; j<=10; j++) {
			System.out.println(j);
			
		}
		
		//1+n+n+n => 1+3n => 3n => O(n)
		//linear eq
		
		for(int p=1; p<=5; p++) {
			for(int q=1; q<=5; q++) {
				System.out.println(p+""+q);
			}
		}
		
		//(1+n+n)(1+n+n+n)=> (1+2n)(1+3n)=> 
		//1+3n+2n+6n^2=> 1+5n+6n^2=> 6n^2+5n=> n(6n+5)=>6n^2=> n^2=>O(n^2)
		//quadratic eq
		
		
		//O(n^3) (1+2n)(1+3n)(1+2n)=> n^3
		for(int p=1; p<=5; p++) {
			for(int q=1; q<=5; q++) {
				for(int r=1; r<=5; r++) {
					System.out.println(p+""+q+""+r);
				}
			}
		}
		
	}

}
