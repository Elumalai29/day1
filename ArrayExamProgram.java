package tamilnadu.ariyalur;

import java.util.Scanner;

public class ArrayExamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int total=0;
		String[] subject = {"Tamil","English","Maths","Science","Social"};
		String[] exam= {"Quaterly","Halferly","Annual"};
		int [][]marks = new int[3][5];
		for(int row =0; row<3; row++) {
			total=0;
			for(int col=0; col<5; col++) {
				System.out.println("Enter "+exam[row]+ "Mark In "+ subject[col]);
				marks[row][col]=sc.nextInt();
				total=total+marks[row][col];
				
			}
		}
		for(int e=0; e<3; e++) {
		System.out.println("Total Marks in "+exam[e]+ "Exam "+ total);
		}

	}
}
