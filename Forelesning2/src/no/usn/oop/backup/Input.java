package no.usn.oop.backup;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
//		System.out.println("What is your name: ");
//		String name = input.nextLine();
		
		System.out.println("What is your age: ");
		int age = input.nextInt();
		
//		System.out.println("What is your height: ");
//		double height = input.nextDouble();
//		
//		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
//		System.out.println("Height: "+height);
		
		input.close();
	}

}
