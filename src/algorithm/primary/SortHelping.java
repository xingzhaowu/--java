package algorithm.primary;

/**
 * 排序辅助类
 * @author Administrator
 *
 */
public class SortHelping {
	private SortHelping(){}
	
	/**
	 * 测试排序算法的运行时间
	 * @param sortName 排序算法的名称
	 * @param data Integer类型数组
	 */
	public static void sortTest(String sortName,Integer[]data){
		long startTime = System.nanoTime();
		if(sortName.equals("SelectionSort"))
			SelectionSort.selectionSort(data);
		else if(sortName.equals("InsertSort"))
			InsertSort.sort(data);
		else if(sortName.equals("InsertSort2"))
			InsertSort.sort2(data);
		long endTime = System.nanoTime();
		double time = (endTime - startTime)/1000000000.0;
		if (!isSorted(data))
			throw new RuntimeException("data sort Exception");
		System.out.println(String.format("%s n=%d t=%f",sortName, data.length,time));
	}
	/**
	 * 交换数组中两个位置的元素
	 * @param data T类型数组
	 * @param i 位置1
	 * @param minIndex 位置2
	 */
	public static<T> void swap(T[] data, int i, int j) {
		T temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	/**
	 * 打印数组
	 * @param data
	 */
	public static<T> void print(T[] data){
		for(T i : data){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	/**
	 * 检查数组是否已排好序
	 * @param data T类型的数组
	 * @return true:表示已排序，false:表示未排序
	 */
	public static<T extends Comparable<T>> boolean isSorted(T[] data){
		for(int i=1; i<data.length; i++){
			if(data[i].compareTo(data[i-1])<0){
				return false;
			}
		}
		return true;
	}
}
