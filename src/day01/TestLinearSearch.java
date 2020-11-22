package day01;

/**
 * 测试线性查找运行时间
 * @author Administrator
 *
 */
public class TestLinearSearch {
	public static void main(String[] args) {
		Integer[] dataSize = {100000,100000000};
		for (Integer n : dataSize){
			long startTime = System.nanoTime();
			Integer[] arr = ArrayGenerator.generatorOrderArray(n);
//			for (int k=0; k<1; k++){
				LinearSearch.search(arr, n);
//			}
			long endTime = System.nanoTime();
			double time = (endTime - startTime)/1000/1000/1000;
			System.out.println("n=" + n + " 1 runs: " + time + "s");
		}
		
	}
}
