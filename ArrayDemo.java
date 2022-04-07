package tamilnadu.ariyalur;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ad = new ArrayDemo();
		ad.task();
	}

	private void task() {
		// TODO Auto-generated method stub
	/*	int no = {1,2,3,4,5};
		int temp = no[4];
/*		no[4]=no[3];
		no[3]=no[2];
		no[2]=no[1];         // for loop
		no[1]=no[0];
		no[0]=temp;
		for(int j=0; j<no.length; j++) {
			System.out.print(no[j]);           // output= 51234
		} */
	/*	int i =4;
		for(; i>no.length-5; i--) {
			no[i] = no[i-1];
		}
		no[i]=temp;
		
		temp= no[4];
	/*	no[4]=no[3];   // for loop
		no[3]=no[2];                                           
		no[2]=no[1];
		no[1]=no[0]                                // for loop
		no[0]=temp;
	/*	for(int j=0; j<no.length; j++) {
			System.out.print(no[j]);            // output= 45123
		} */
	/*	int j =4;
		for(; j>no.length-5; j--) {
			no[j] = no[j-1];
		}
		no[j]=temp;
		
		temp= no[4];  
	/*	no[4]=no[3];
		no[3]=no[2];       // for loop
		no[2]=no[1];
		no[1]=no[0];
		no[0]=temp; */
		int[] no = {1,2,3,4,5};
		for(int i=1; i<=3; i++) {
		int temp = no[4];
		int l =4;
		for(; l>no.length-5; l--) {
			no[l] = no[l-1];
		}
		no[l]=temp;
		}
		
		for(int k=0; k<no.length; k++) {
			System.out.print(no[k]);             // output= 34512
		}
		
		
		
	}

}
