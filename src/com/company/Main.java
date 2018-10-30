package com.company;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("What do you want n to be?");
	    int n = input.nextInt();
	    int sum = 0;
	    for(int r = 0; r <= n; r++) {
		    sum = sum + r
	    }
	    System.out.println("The sum from 1 to n is" + sum);
    }
}
