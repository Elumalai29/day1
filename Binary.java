package tamilnadu.chennai;

public class Binary {
public static void main(String[] args) {
	Binary b = new Binary();
	b.binary();
}

private void binary() {
	// TODO Auto-generated method stub
	int no = 1011;
	int deciml = 0;
	int power = 0;
	while(no>0) 
	{
	int rem = no%10;
	decimal += Math.pow(2, power)*rem;
	rem = no/10;
	power++;
	}
	System.out.println(decimal);
}
}
