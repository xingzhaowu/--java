package algorithm.primary;

/**
 * ��������
 * @author Administrator
 *
 */
public class SortHelping {
	private SortHelping(){}
	
	/**
	 * ���������㷨������ʱ��
	 * @param sortName �����㷨������
	 * @param data Integer��������
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
	 * ��������������λ�õ�Ԫ��
	 * @param data T��������
	 * @param i λ��1
	 * @param minIndex λ��2
	 */
	public static<T> void swap(T[] data, int i, int j) {
		T temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	/**
	 * ��ӡ����
	 * @param data
	 */
	public static<T> void print(T[] data){
		for(T i : data){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	/**
	 * ��������Ƿ����ź���
	 * @param data T���͵�����
	 * @return true:��ʾ������false:��ʾδ����
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
