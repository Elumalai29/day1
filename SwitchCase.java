package tamilnadu;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	//SwitchCase sc = new SwitchCase();
	//sc.switchProgram();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Day in case number you want to print : ");
	int day = sc.nextInt();
	switch (day) {
	  case 1:
	    System.out.println("Monday");
	    break;
	  case 2:
	    System.out.println("Tuesday");
	    break;
	  case 3:
	    System.out.println("Wednesday");
	    break;
	  case 4:
	    System.out.println("Thursday");
	    break;
	  case 5:
	    System.out.println("Friday");
	    break;
	  case 6:
	    System.out.println("Saturday");
	    break;
	  case 7:
	    System.out.println("Sunday");
	    break;
       default:
        System.out.println("None of the above");
	}

}}
