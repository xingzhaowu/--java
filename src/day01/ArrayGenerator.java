package day01;

import java.util.Random;

/**
 * ����������
 * @author Administrator
 *
 */
public class ArrayGenerator {
	private ArrayGenerator(){}
	
	/**
	 * ����һ������ĳ���Ϊn����������
	 * @param n ���鳤��
	 * @return
	 */
	public static Integer[] generatorOrderArray(int n){
		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++){
			arr[i] = i;
		}
		return arr;
	}
	
	/**
	 * 
	 * ����һ������ĳ���Ϊn����������
	 * @param n ���鳤��
	 * @param bond ������߽�
	 * @return
	 */
	public static Integer[] generatorRandomArray(int n,int bond){
		Integer[] arr = new Integer[n];
		Random random = new Random();
		for(int i=0; i<n ; i++){
			arr[i] = random.nextInt(bond);
		}
		return arr;
	}

}
