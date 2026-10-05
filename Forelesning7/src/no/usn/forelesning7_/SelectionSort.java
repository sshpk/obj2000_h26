package no.usn.forelesning7_;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		
		numbers[0] = 5;
		numbers[1] = 4;
		numbers[2] = 2;
		numbers[3] = 1;
		numbers[4] = 6;
		numbers[5] = 3;
		
		for(int i = 0; i < numbers.length-1; i++) {
			int minIndex = i;
			for(int j = i+1; j < numbers.length; j++) {
				if(numbers[j]<numbers[minIndex]) {
					minIndex = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[minIndex];
			numbers[minIndex] = temp;
		}

		
		for(int i:numbers) {
			System.out.println(i);
		}
	}

}
