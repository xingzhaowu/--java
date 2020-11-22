package day02;

import day01.ArrayGenerator;

/**
 * ��������
 * @author Administrator
 *
 */
public class InsertSort {
	private InsertSort(){};
	
	/**
	 * ��������
	 * @param data T���͵�����
	 * @return ����������
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
