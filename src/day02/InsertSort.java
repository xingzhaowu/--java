package day02;

import java.util.Arrays;

import day01.ArrayGenerator;

/**
 * 插入排序
 * @author Administrator
 *
 */
public class InsertSort {
	private InsertSort(){};
	
	/**
	 * 插入排序
	 * @param data T类型的数组
	 * @return 排序后的数组
	 */
	public static<T extends Comparable<T>> T[] sort(T[] data){
		for(int i=0; i<data.length; i++){
			for(int j=i; j>0; j--){
				if(data[j].compareTo(data[j-1])<0){
					SortHelping.swap(data, j, j-1);
				}else{
					break;
				}
			}
		}
		return data;
	}
	
	/**
	 * 插入排序优化
	 * @param data T类型的数组
	 * @return 排序后的数组
	 */
	public static<T extends Comparable<T>> T[] sort2(T[] data){
		for(int i=0; i<data.length; i++){
			int j;
			T t = data[i];
			for(j=i; j>0 && t.compareTo(data[j-1])<0; j--){
				data[j] = data[j-1];
			}
			data[j] = t;
		}
		return data;
	}
	public static void main(String[] args) {
		int[] dataSize = {10000,100000};
//		for(int n : dataSize){
//			Integer[] data = ArrayGenerator.generatorRandomArray(n,n);
//			SortHelping.sortTest("InsertSort",data);
//		}
		for(int n : dataSize){
			Integer[] data = ArrayGenerator.generatorRandomArray(n,n);
			Integer[] data2 = Arrays.copyOf(data, data.length);
			Integer[] data3 = Arrays.copyOf(data, data.length); 
			System.out.println("Random Arr:");
			SortHelping.sortTest("SelectionSort",data);
			SortHelping.sortTest("InsertSort",data2);
			SortHelping.sortTest("InsertSort2",data3);
			
			System.out.println();
			
			System.out.println("Ordered Arr:");
			data = ArrayGenerator.generatorOrderArray(n);
			data2 = Arrays.copyOf(data, data.length);
			data3 = Arrays.copyOf(data, data.length); 
			SortHelping.sortTest("SelectionSort",data);
			SortHelping.sortTest("InsertSort",data2);
			SortHelping.sortTest("InsertSort2",data3);
			System.out.println();
		}
//		Integer[] data = ArrayGenerator.generatorRandomArray(30, 30);
//		SortHelping.print(sort(data));
		
	}
}
