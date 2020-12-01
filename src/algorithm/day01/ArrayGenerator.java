package day01;

import java.util.Random;

/**
 * 数组生成器
 * @author Administrator
 *
 */
public class ArrayGenerator {
	private ArrayGenerator(){}
	
	/**
	 * 生成一个有序的长度为n的整型数组
	 * @param n 数组长度
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
	 * 生成一个随机的长度为n的整型数组
	 * @param n 数组长度
	 * @param bond 随机数边界
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
