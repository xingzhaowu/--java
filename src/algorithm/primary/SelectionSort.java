package day02;

import day01.ArrayGenerator;
//import day01.Student;

/**
 * 选择排序
 * @author Administrator
 *
 */
public class SelectionSort {
	/**
	 * 选择排序，从小到大
	 * @param data T类型数组
	 * @return 排序后的数组
	 */
	public static <T extends Comparable<T>> T[] selectionSort(T[] data){
		
		for(int i=0; i<data.length; i++){
			int minIndex = i;
			for(int j=i+1; j<data.length; j++){
				
				if(data[j].compareTo(data[minIndex]) < 0){
					minIndex = j;
				}
			}
			SortHelping.swap(data, i, minIndex);
					
		}
		return data;
	}
	
	/**
	 * 选择排序，从大到小排序
	 * @param arr T类型的数组
	 * @return 排序后的数组
	 */
	public static<T extends Comparable<T>> T[] selectionSort2(T[] arr){
		for(int i=arr.length-1; i>=0; i--){
			int maxIndex = i;
			for (int j=i; j>=0; j--){
				if(arr[maxIndex].compareTo(arr[j])<0){
					maxIndex = j;
				}
			}
			SortHelping.swap(arr,i,maxIndex);
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		int[] dataSize = {10000,100000};
		for(int n : dataSize){
			Integer[] data = ArrayGenerator.generatorRandomArray(n,n);
			SortHelping.sortTest("SelectionSort",data);
		}
		Integer[] data = ArrayGenerator.generatorRandomArray(30, 30);
		SortHelping.print(selectionSort2(data));
//		print(data);
//		Student[] students = {
//				new Student("1", 12, 88),
//				new Student("2", 12, 90),
//				new Student("3", 12, 79)
//		};
//		selectionSort(students);
//		print(students);
	}
}
