package hw10;


	import java.util.Scanner;

	public class GradeBookKeeper {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter the number of students: ");
	        int numStudents = in.nextInt();
	        int[] grades = new int[numStudents];
	        for (int i =0 ; i < grades.length; i++) {
	            System.out.print("Enter the grade for student " + (i+1) + ": ");
	            grades[i] = in.nextInt();
	        }
	        double avg = 0;
	        int min = grades[0], max = grades[0];
	        for (int i =0 ; i < grades.length; i++) {
	            avg += grades[i];
	            if (grades[i] > max) max = grades[i];
	            if (grades[i] < min) min = grades[i];
	        }
	        avg /= grades.length;
	        System.out.printf("The average is %.2f\n", avg);
	        System.out.println("The minimum is: " + min);
	        System.out.println("The maximum is: " + max);
	    }
	}

