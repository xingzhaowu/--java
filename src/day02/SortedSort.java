package day02;

public class SortedSort {
	public static int[] sortedSort(int[] data){
		
		for(int i=0; i<data.length; i++){
			int minIndex = i;
			for(int j=i+1; j<data.length; j++){
				
				if(data[j] < data[minIndex]){
					minIndex = j;
				}
			}
			swap(data, i, minIndex);
					
		}
		return data;
	}
	private static void swap(int[] data, int i, int minIndex) {
		int temp = data[i];
		data[i] = data[minIndex];
		data[minIndex] = temp;
	}
	public static void print(int[] data){
		for(int i : data){
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int[] data = sortedSort(new int[]{1,13,88,4,7,99,6,2,99,76});
		print(data);
	}
}
