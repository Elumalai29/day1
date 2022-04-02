package tamilnadu.ariyalur;

public class NestClass {
	public static void main(String[] args) {
		NestClass nc = new NestClass();
		nc.nestm();
		nc.nesta();
		nc.nestl();
		nc.nestu();
		
	}

	private void nestm() {
		// TODO Auto-generated method stub
		System.out.println('\n');
		for(int row=5; row>=1; row--) 
		{
			if(row==5) 
			{
				for(int col=7; col>=1; col--) 
				{
				  System.out.print("m");
			   }
			}
			   else{
				for(int star=1; star<=7; star++)
				{
					if(star==1||star==4||star==7)
						System.out.print("m");
					else
						System.out.print(" ");
				} 
			    }
		    System.out.println(" ");
		   }	
		}

	private void nesta() {
		// TODO Auto-generated method stub
		System.out.println('\n');
		for(int row=5; row>=1; row--) 
		{
			if(row==5||row==3) 
			{
				for(int col=5; col>=1; col--) 
				{
				  System.out.print("a");
			   }
			}
			   else{
				for(int star=1; star<=5; star++)
				{
					if(star==1||star==5)
						System.out.print("a");
					else
						System.out.print(" ");
				} 
			    }
		    System.out.println(" ");
		   }
	}

	private void nestl() {
		// TODO Auto-generated method stub
		System.out.println('\n');
		for(int row=5; row>=1; row--) 
		{
			if(row==1) 
			{
				for(int col=5; col>=1; col--) 
				{
				  System.out.print("l");
			   }
			}
			   else{
				for(int star=1; star<=5; star++)
				{
					if(star==1)
						System.out.print("l");
					else
						System.out.print(" ");
				} 
			    }
		    System.out.println("");
		   }
	}

	private void nestu() {
		// TODO Auto-generated method stub
		System.out.println('\n');
		for(int row=5; row>=1; row--) 
		{
			if(row==1) 
			{
				for(int col=2; col>=1; col--) 
				{
				  System.out.print(" u");
			   }
			}
			   else{
				for(int star=1; star<=5; star++)
				{
					if(star==1||star==5)
						System.out.print("u");
					else
						System.out.print(" ");
				} 
			    }
		    System.out.println("");
		   }
	}
}
