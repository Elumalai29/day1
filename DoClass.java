package tamilnadu;

public class DoClass {
 public static void main(String[] args) {
	DoClass dc = new DoClass();
	dc.forClass();
	dc.doClass();
}

private void forClass() {
	// TODO Auto-generated method stub
	int no;
	System.out.println("Print 1st table to number 5");
	for(no=1; no<=5;no++)
	{
		System.out.println(no);
	}
	System.out.println("Print 2nd table to number 10");
	for(no=1; no<10;no++)
	{
		no+=1;
		System.out.println(no);
	}
	System.out.println("Print 3rd table to number 15");
	for(no=1; no<15;no++)
	{
		no+=2;
		System.out.println(no);
	}
	System.out.println("Print 4th table to number 20");
	for(no=1; no<20;no++)
	{
		no+=3;
		System.out.println(no);
	}
	System.out.println("Print double the number to 16");
	int no1;
	for(no=1; no<=16;)
	{
		System.out.println(no);
		no*=2;

	}
	System.out.println("Print Square value from 1 to 5");
	for(no=1; no<=5; no++)
	{
		no1=no*no;
		System.out.println(no1);
	}
	System.out.println("Print cube value from 1 to 5");
	for(no=1; no<=5; no++)
	{
		no1=no*no*no;
		System.out.println(no1);
	}
	

}

private void doClass() {
	// TODO Auto-generated method stub
	int no =1;
	System.out.println("Print 1st table from 1 to 5" );
	do {
		System.out.println(no);
		no++;
	}while(no<=5);
	no=1;
	System.out.println("Print 2nd table from 1 to 10" );
	do {
		no++;
		System.out.println(no);
		no+=1;
	}while(no<10);
	no=1;
	System.out.println("Print 3rd table from 1 to 15" );
	do {
	    no+=2;
		System.out.println(no);
		no++;
	}while(no<15);
	no=1;
	System.out.println("Print 4th table from 1 to 20" );
	do {
	    no+=3;
		System.out.println(no);
		no++;
	}while(no<20);
	no=1;
	System.out.println("Print twice the given number from 1 to 16" );
	do {
		System.out.println(no);
		no*=2;
	}while(no<=16);
	no=1;
	System.out.println("Print square the given number from 1 to 5" );
	do {
		System.out.println(no*no);
		no++;
	}while(no<=5);
	no=1;
	System.out.println("Print cube the given number from 1 to 16" );
	do {
		System.out.println(no*no*no);
		no++;
	}while(no<=5);
}

}
