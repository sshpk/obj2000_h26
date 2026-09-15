package no.usn.forelesning5_;

import java.util.Scanner;

public class Student {
	private String name;
	private double score;
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}
	
	public Student(String name) {
		this.name = name;
		this.score = 80;
	}
	
	public Student() {
		this.name = "Ukjent";
		this.score = 80;
	}
	
	public Student(Student other) {
		this.name = other.getName();
		this.score = other.getScore();
	}
	
	public String getName() {
		return name;
	}
	public double getScore() {
		return score;
	}
	
	public boolean hasSameName(Student other) {
		String name2 = other.getName();
		return name.equalsIgnoreCase(name2);
	}
	
	public void print() {
		//System.out.println("Navn: "+name+" Poengsum: "+score);
		
		System.out.printf("Navn: %s Poengsum: %.2f ", name, score);
		System.out.println();
	}
	
	public void setScore(Scanner input) {
		System.out.println("Skriv inn poengsum (0-100): ");
		double newScore = input.nextDouble();
		while(newScore < 0 || newScore > 100) {
			System.out.println("Ugyldig, prøv igen: ");
			newScore = input.nextDouble();
		}
		score = newScore;
	}
	
	public void setScore2(Scanner input) {
		double newScore;
		do {
			System.out.println("Skriv inn poengsum (0-100): ");
			newScore = input.nextDouble();
		} while(newScore < 0 || newScore > 100);
		score = newScore;
	}
	
	public void printReport(int copies) {
		for (int i = 1; i <= copies; i++) {
			if(i==2)
				continue;
			System.out.println("---- Rapport "+ i+ " ----");
			System.out.println("Navn: "+name);
			System.out.println("Poengsum: "+score);
		}
	}
}
