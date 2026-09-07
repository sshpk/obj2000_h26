package no.usn.kap2;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		int age = 18;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = input.nextLine();
		System.out.println("Enter your age");
		age = input.nextInt();	
		System.out.println("Enter your height");
		double height = input.nextDouble();
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Height = "+height);

	}

}
