package tamilnadu.chennai;

public class Binary {
public static void main(String[] args) {
	Binary b = new Binary();
	b.binary();
}

private void binary() {
	// TODO Auto-generated method stub
	int no = 1011;
	int power = 0;
	while(power<= 4) 
	{
	int rem = no%10;
	System.out.println(rem* Math.pow(2, power));
	rem = no/10;
	power++;
	}
}
}
