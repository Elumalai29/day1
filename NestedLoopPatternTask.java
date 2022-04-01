package tamilnadu.ariyalur;

public class NestedLoopPatternTask {
	public static void main(String[] args) {
		NestedLoopPatternTask nl = new NestedLoopPatternTask();
		nl.doubtPattern();  // refer in website
		nl.patternTask();
		nl.patternProgram();
	}

	private void doubtPattern() {
		// TODO Auto-generated method stub
		for(int row=1; row<5; row++)
	    {
	      for(int col=0; col<row; col++)
	      {
	        System.out.print((row * (row - 1)) / 2 + col + 1 +" ");
	      }
	      System.out.println("");
	    }
	}

	private void patternTask() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5; row++)
	    {
	      
	    for(int col=0; col<row; col++)
	    {
	    
	    System.out.print((6-row)-col +" ");
	    }
	    
	    System.out.println();
	    }
	  }

	private void patternProgram() {
		// TODO Auto-generated method stub
		for(int row=1; row<5; row++)
		{
			for(int col=0; col<row; col++)
			{
				System.out.print(9-col-(row * (row - 1) / 2)  +" ");
			}
			System.out.println("");
		}
	}

}
