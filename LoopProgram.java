package seven;

public class LoopProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopProgram lp=new LoopProgram();
		lp.primeNo();
		lp.palindrome();
		lp.fibo();
		lp.factorial();
	}

	private void factorial() {
		// TODO Auto-generated method stub
		int no=5,fact=1;
		for(int i=1;i<=no;i++) {
			 fact= fact*i;
		}
		System.out.println('\n'+"The factorial of "+no+" is "+fact);
	}

	private void fibo() {
		// TODO Auto-generated method stub
		int no1=0,no2=1,no3=0;
		System.out.print("The fibonacci series is "+no1+" "+no2);
		while(no3<10) {
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(" "+no3);		

		}
	}

	private void palindrome() {
		// TODO Auto-generated method stub
		int no=54,sum=0,rem;
		int temp=no;
		while(no>0) {
			rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		if(sum==temp) {
			System.out.println("The given no "+temp+" is a palindrome");
		}
		else if(sum!=temp){
			System.out.println("The given no "+temp+" is not a palindrome");
		}
	}

	private void primeNo() {
		// TODO Auto-generated method stub
		int no =15;
		int prime=0;
		for(int i=2; i<no;i++) {
			if(no%i==0) {
				System.out.println("The given no "+no+" is not primeNumber");
				prime=1;
				break;
			}
		}
		 if(prime==0){
			System.out.println("The given no "+no+" is primeNumber");
	}
}

}
