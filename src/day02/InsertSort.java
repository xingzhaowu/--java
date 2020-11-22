package day02;

import java.util.Arrays;

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
	
	/**
	 * ���������Ż�
	 * @param data T���͵�����
	 * @return ����������
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
	
	/**
	 * ��һ�ַ�ʽʵ�ֲ�������
	 * ѭ��������[i,n)Ϊ������[0,i)δ����
	 * @param args
	 */
	public static<T extends Comparable<T>> T[] sort3(T[] data){
		for(int i=data.length-1; i>=0; i--){
			int j;
			T t = data[i];
			for(j=i; j+1<data.length && t.compareTo(data[j+1])>0; j++){
				data[j] = data[j+1];
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
