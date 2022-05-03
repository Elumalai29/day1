package seven;

public class ArrayDemoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemoProgram ad =new ArrayDemoProgram();
		ad.maxAndMin();
		ad.secondMaxAndMin();
		ad.bubbleSorting();
		ad.searchingLinear();
		
		
	}

	private void searchingLinear() {
		// TODO Auto-generated method stub
	String[] names = {"boobathi","elumalai","jeswin","elumalai","kiruba","ragini"};
		
	String key = "elumalai";
	String name ="elumalai" ;
	 for(int i=0; i<names.length;i++) {
		 if(key==names[i]) {
			 System.out.println('\n'+"The key ( "+key+" ) is present at "+i+" position");
			 //break;
		 }
	 }
	  if(key!=name){
		 System.out.println("The key ( "+key+" ) is not present");
	 }
}
	
	private void bubbleSorting() {
		// TODO Auto-generated method stub
		int temp, size;
	      int array[] = {-10, 20, -25, 63, 96, 57};
	      size = array.length;
	      System.out.println("The ascending order of given no is");

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j])
	            {
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
		      System.out.print(array[i]+" ");

	      }
	}

	private void secondMaxAndMin() {
		// TODO Auto-generated method stub
		int[] age = {80,65,80,-73, 62,7}; 
		int max =0, smax=0; 
	    max=age[0];
		for(int i=0;i<age.length;i++)
		{
		if(age[i]<max){    
			smax = max;
			max = age[i]; 
		}
		else if(age[i]<smax && age[i]!=max)
		{
		smax = age[i]; 
		}
	}
		
		System.out.println("The min no in a given data is = "+max);
		System.out.println("The second min no in a given data is = "+smax); 
	
		
		
		
	   }

	private void maxAndMin() {
		// TODO Auto-generated method stub
		int[]array = {190,-5,100,25,-50,1};
		int max=0;
		max=array[0];
		for(int i=0; i<array.length;i++ ) {
			if(array[i]<max) {
				max=array[i];
			}
			
		}
		System.out.println("the max value in givan data is = "+max);
	}

}
