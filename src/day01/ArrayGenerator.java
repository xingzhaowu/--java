package day01;

import java.util.Random;

public class ArrayGenerator {
	private ArrayGenerator(){}
	
	public static Integer[] generatorOrderArray(int n){
		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++){
			arr[i] = i;
		}
		return arr;
	}
	
	public static Integer[] generatorRandomArray(int n,int bond){
		Integer[] arr = new Integer[n];
		Random random = new Random();
		for(int i=0; i<n ; i++){
			arr[i] = random.nextInt(bond);
		}
		return arr;
	}

}
