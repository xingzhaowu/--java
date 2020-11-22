package day02;

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
	public static void main(String[] args) {
		int[] dataSize = {10000,100000};
		for(int n : dataSize){
			Integer[] data = ArrayGenerator.generatorRandomArray(n,n);
			SortHelping.sortTest("InsertSort",data);
		}
		for(int n : dataSize){
			Integer[] data = ArrayGenerator.generatorRandomArray(n,n);
			SortHelping.sortTest("SelectionSort",data);
		}
//		Integer[] data = ArrayGenerator.generatorRandomArray(30, 30);
//		SortHelping.print(sort(data));
		
	}
}
