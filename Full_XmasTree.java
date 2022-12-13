package hw07;

import java.util.Scanner;

public class Full_XmasTree {

	public static void main(String[] args) {
		int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter The Desired Number Of Rows :");

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {

                System.out.print(" ");

            }

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }
        

        sc.close();

    }



	}


