package hw08;

import java.util.Scanner;

public class PhoneNumberDecoder {
	
	    public static void main(String[] args) {
	        Scanner scnr = new Scanner(System.in);
	        String phoneStr; 
	        int i; 
	        char currChar; 
	        System.out.print("Enter phone number: ");
	        phoneStr = scnr.next();
	        System.out.print("Numbers only: ");
	        for (i = 0; i < phoneStr.length(); ++i) { 
                currChar = phoneStr.charAt(i);
	            if ((currChar >= '0') && (currChar <= '9')) {
	                System.out.print(currChar); 
	            }
	
	            else if (Character.isAlphabetic(currChar)) {
	                currChar = Character.toUpperCase(currChar);
	                if (currChar == 'A' || currChar == 'B' || currChar == 'C') {
	                    currChar = '2';
	                } else if (currChar == 'D' || currChar == 'E' || currChar == 'F') {
	                    currChar = '3';
	                } else if (currChar == 'G' || currChar == 'H' || currChar == 'I') {
	                    currChar = '4';
	                } else if (currChar == 'J' || currChar == 'K' || currChar == 'L') {
	                    currChar = '5';
	                } else if (currChar == 'M' || currChar == 'N' || currChar == 'O') {
	                    currChar = '6';
	                } else if (currChar == 'P' || currChar == 'Q' || currChar == 'R' || currChar == 'S') {
	                    currChar = '7';
	                } else if (currChar == 'T' || currChar == 'U' || currChar == 'V') {
	                    currChar = '8';
	                } else if (currChar == 'W' || currChar == 'X' || currChar == 'Y' || currChar == 'Z') {
	                    currChar = '9';
	                }
	                System.out.print(currChar);
	            } else if (currChar == '-') {
	                System.out.print(currChar);
	            } else {
	                System.out.print('?');
	            }
	        }
	        System.out.println("");
	    }
	}

