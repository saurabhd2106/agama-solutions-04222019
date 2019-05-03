package day4;

import java.util.Random;

public class CountArray {

	public static void main(String[] args) {
		int[] arr = new int[100];

		Random ran = new Random();
		
		
		for(int i=0; i< arr.length; i++){
			arr[i] = ran.nextInt(10);
		}
		
		int count[] = new int[10];
		
		for(int i=0; i< arr.length; i++){
			count[arr[i]]++;
		}
		
		for(int j=0; j<count.length; j++) {
			System.out.println(j + "th count : "+ count[j]);
		}
		
	}

}
