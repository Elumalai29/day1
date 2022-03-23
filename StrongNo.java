package tamilnadu.chennai;

public class StrongNo {
public static void main(String[] args) {
	StrongNo sn = new StrongNo();
	sn.factorial();
}

private void factorial() {
	// TODO Auto-generated method stub
	int no = 145;
	int total =0;
	while(no>0) {
		int rem = splitDigit(no);
		int fact = factorial(rem);
		total = total+fact;
		no =no/10;
	}
	System.out.println(total);
}

private static int factorial(int rem) {
	// TODO Auto-generated method stub
	if(rem==0)
		return 1;
	else
		return(rem*factorial(rem-1));

}
 private static int splitDigit(int no) {
	// TODO Auto-generated method stub
	return no%10;
}
}
